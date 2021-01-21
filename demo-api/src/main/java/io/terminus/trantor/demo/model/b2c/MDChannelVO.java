/*
 * Copyright (c) 2020. 杭州端点网络科技有限公司.  All rights reserved.
 */

package io.terminus.trantor.demo.model.b2c;
import io.terminus.trantor.api.annotation.BaseModel;
import io.terminus.trantor.api.annotation.FieldGroup;
import io.terminus.trantor.api.annotation.TModel;
import io.terminus.trantor.api.annotation.TModelField;
import io.terminus.trantor.api.annotation.typemeta.DictionaryMeta;
import io.terminus.trantor.api.annotation.typemeta.RelationMeta;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/**
 * @author lsk mailto:liushaokang@terminus.io
 * @create 2020-07-07 9:54 上午
 **/
@Data
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
@TModel(name = "渠道", mainField = MDChannelVO.name_field, isTransient = true, fieldGroups = {@FieldGroup(fieldName = {"id", "name", "code", "type", "manageType"})})
public class MDChannelVO extends BaseModel<Long> {

    @TModelField(name = "渠道经营主体")
    @RelationMeta(name = "MDEnterpriseVO", modelClass = MDEnterpriseVO.class)
    private MDEnterpriseVO enterprise;

    @TModelField(name = "渠道编码")
    private String code;

    @TModelField(name = "渠道名称")
    private String name;

    @TModelField(name = "渠道类型")
    @DictionaryMeta(clazz = ChannelTypeDict.class)
    private String type;

    @TModelField(name = "渠道分类")
    @DictionaryMeta(clazz = ClassificationDict.class)
    private String classification;

    @TModelField(name = "渠道状态")
    @DictionaryMeta(clazz = ChannelStatusDict.class)
    private String status;

    @TModelField(name = "渠道描述")
    private String desc;

    @TModelField(name = "渠道经营类型")
    @DictionaryMeta(clazz = ChannelManageTypeDict.class)
    private String manageType;
}
