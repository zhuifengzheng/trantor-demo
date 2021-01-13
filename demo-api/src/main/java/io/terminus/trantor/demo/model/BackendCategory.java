package io.terminus.trantor.demo.model;

import io.terminus.trantor.api.annotation.BaseModel;
import io.terminus.trantor.api.annotation.TModel;
import io.terminus.trantor.api.annotation.TModelField;
import io.terminus.trantor.api.annotation.typemeta.RelationMeta;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@TModel(name = "后台类目", mainField = "name")
@Data
public class BackendCategory extends BaseModel<Long> {
    private static final long serialVersionUID = -2470048164289824775L;

    @TModelField(name = "父类目")
    @RelationMeta(name = "BackendCategoryParent")
    private BackendCategory parent;
    @TModelField(name = "名称", nullable = false)
    private String name;
    @TModelField(name = "层级")
    private Integer level;
    @TModelField
    private Boolean hasChildren = false;
    @TModelField
    private Boolean hasSPU = false;
}