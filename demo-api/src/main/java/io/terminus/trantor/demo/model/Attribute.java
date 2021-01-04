package io.terminus.trantor.demo.model;

import io.terminus.trantor.api.annotation.BaseModel;
import io.terminus.trantor.api.annotation.TModel;
import io.terminus.trantor.api.annotation.TModelField;
import io.terminus.trantor.api.annotation.TModelFieldType;
import io.terminus.trantor.api.annotation.typemeta.JsonMeta;
import io.terminus.trantor.api.annotation.typemeta.Label;
import io.terminus.trantor.api.annotation.typemeta.RelationMeta;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

@EqualsAndHashCode(callSuper = true)
@TModel(name = "商品属性", mainField = "key")
@Data
public class Attribute extends BaseModel<Long> {
    private static final long serialVersionUID = -8686416308006622522L;

    public enum ValueType {
        @Label("字符串")
        String,
        @Label("数字")
        Number,
        @Label("时间")
        Date,
    }

    @TModelField(name = "属性名称", nullable = false)
    private String key;
    @TModelField
    private String group;
    @TModelField(name = "所属类目")
    @RelationMeta(name = "AttributeBackendCategories", modelClass = BackendCategory.class)
    private List<BackendCategory> backendCategories;
    @TModelField(name = "必填")
    private boolean required;
    @TModelField(name = "可用作销售属性")
    private boolean skuCandidate;
    @TModelField(name = "可搜索")
    private boolean searchable;
    @TModelField(name = "允许自定义")
    private boolean userDefined;
    @TModelField(name = "前台展示")
    private boolean pseudoSkuCandidate;
    @TModelField(name = "值类型", defaultValue = "String")
    private ValueType valueType = ValueType.String;
    @TModelField(name = "属性值", type = TModelFieldType.Json)
    @JsonMeta(arrayClass = String.class)
    private List<String> attrVals;
}