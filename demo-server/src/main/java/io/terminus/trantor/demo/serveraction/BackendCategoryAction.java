package io.terminus.trantor.demo.serveraction;

import io.terminus.platform.sdk.transaction.DSTransaction;
import io.terminus.trantor.api.annotation.TAction;
import io.terminus.trantor.demo.dao.BackendCategoryRepository;
import io.terminus.trantor.demo.model.BackendCategory;
import io.terminus.trantor.sdk.autumn.Query;
import io.terminus.trantor.sdk.autumn.param.ConditionSet;
import io.terminus.trantor.sdk.autumn.param.Operators;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;
import java.util.function.Consumer;

/**
 * 每个持久化模型默认总是会生成一组 Action 而无需定义，以后台类目为例，这组 Action 为：
 * • terminus_trantor_demo_BackendCategory_create
 * • terminus_trantor_demo_BackendCategory_delete
 * • terminus_trantor_demo_BackendCategory_update
 * • terminus_trantor_demo_BackendCategory_removeRelation
 * • terminus_trantor_demo_BackendCategory_listAll
 * • terminus_trantor_demo_BackendCategory_toEdit
 * • terminus_trantor_demo_BackendCategory_toDetail
 */
@Component
@Slf4j
public class BackendCategoryAction {
    @Autowired
    private BackendCategoryRepository backendCategoryRepository;

    @TAction(modelClass = BackendCategory.class)
    @DSTransaction
    public BackendCategory save(final BackendCategory category, BackendCategory parent, String customField) {
        log.info("Server action got custom field, [{}], [{}]", customField, category.get("customField"));
        BackendCategory parentInDB = (parent == null || parent.getId() == null) ? null : backendCategoryRepository.findById(Long.valueOf(parent.getId())).get();

        category.setParent(parentInDB);
        category.setLevel(parentInDB == null ? 0 : parentInDB.getLevel() + 1);
        BackendCategory result = backendCategoryRepository.create(category);
//        BackendCategory result = backendCategoryRepository.insert(category);

        if (parentInDB != null && !parentInDB.getHasChildren()) {
            parentInDB.setHasChildren(true);
            backendCategoryRepository.update(parentInDB);
        }
        return result;
    }

    @TAction(modelClass = BackendCategory.class)
    @DSTransaction
    public void delete(String id, BackendCategory parent) {
        if (parent != null) {
//            ConditionSet condition = new ConditionSet();
            Consumer<Query<Class<BackendCategory>, BackendCategory>> builder = (query) -> {
                query.where(convert(parent));
            };
            long siblingCount = backendCategoryRepository.count(builder);
            if (siblingCount == 1) {
                parent.setHasChildren(false);
                backendCategoryRepository.update(parent);
            }
        }
        backendCategoryRepository.delete(Long.valueOf(id));
    }

    /**
     * 构造条件
     * @param criteria
     * @return
     */
    public Consumer<ConditionSet> convert(BackendCategory criteria) {
        if (criteria == null) {
            return null;
        }

        return condition->{
            condition.condition("id", Operators.EQ_FIELD, criteria.getId());
        };
    }
}