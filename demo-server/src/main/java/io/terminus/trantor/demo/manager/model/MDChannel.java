/*
 * Copyright (c) 2020. 杭州端点网络科技有限公司.  All rights reserved.
 */

package io.terminus.trantor.demo.manager.model;

import io.terminus.trantor.api.annotation.*;
import io.terminus.trantor.api.annotation.typemeta.DictionaryMeta;
import io.terminus.trantor.api.annotation.typemeta.TextMeta;
import io.terminus.trantor.demo.model.b2c.ChannelManageTypeDict;
import io.terminus.trantor.demo.model.b2c.ChannelStatusDict;
import io.terminus.trantor.demo.model.b2c.ChannelTypeDict;
import io.terminus.trantor.demo.model.b2c.ClassificationDict;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/**
 * @author lsk mailto:liushaokang@terminus.io
 * @create 2020-06-15 2:03 下午
 **/
@Data
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
@TModel(name = "渠道",
        mainField = "name",
        idRule = @IDRule(rule = IDRule.AUTO_INCREMENT),
        dbTableName = "md_channel"
)
public class MDChannel extends BaseModel<Long> {

    @TModelField(name = "渠道经营主体", dbColumnName = "enterprise_id")
    private Long enterpriseId;

    @TModelField(name = "渠道编码", dbColumnName = "code")
    @TextMeta(rule = "STRING(CH)+TIMES(yyyy-MM-dd)+INCRE(1,6,4,1)+RANDOM(4,1)")
    private String code;

    @TModelField(name = "渠道简码编码", dbColumnName = "simple_code")
    @TextMeta(rule = "STRING(CHS)+TIMES(yyyy-MM-dd)+INCRE(1,6,4,1)")
    private String simpleCode;

    @TModelField(name = "渠道名称", dbColumnName = "name")
    private String name;

    @TModelField(name = "渠道类型", dbColumnName = "type")
    @DictionaryMeta(clazz = ChannelTypeDict.class)
    private String type;

    @TModelField(name = "渠道分类", dbColumnName = "classification")
    @DictionaryMeta(clazz = ClassificationDict.class)
    private String classification;

    @TModelField(name = "渠道状态", dbColumnName = "status")
    @DictionaryMeta(clazz = ChannelStatusDict.class)
    private String status;

    @TModelField(name = "渠道描述", dbColumnName = "desc", type = TModelFieldType.MultiText)
    private String desc;

    @TModelField(name = "渠道经营类型", dbColumnName = "manage_type")
    @DictionaryMeta(clazz = ChannelManageTypeDict.class)
    private String manageType;
}
