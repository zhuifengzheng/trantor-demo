/*
 * Copyright (c) 2020. 杭州端点网络科技有限公司.  All rights reserved.
 */

package io.terminus.trantor.demo.model.b2c;

import io.terminus.trantor.api.annotation.*;
import io.terminus.trantor.api.annotation.type.Address;
import io.terminus.trantor.api.annotation.typemeta.AddressMeta;
import io.terminus.trantor.api.annotation.typemeta.DictionaryMeta;
import io.terminus.trantor.api.annotation.typemeta.RelationMeta;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import javax.validation.constraints.NotNull;

/**
 * @author lsk mailto:liushaokang@terminus.io
 * @create 2020-07-07 4:00 下午
 **/
@Data
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
@TModel(name = "店铺", isTransient = true, mainField = "name", fieldGroups = {@FieldGroup(fieldName = {"id", "name", "code", "shopType", "channel"})})
public class MDShopVO extends BaseModel<Long> {

    @TModelField(name = "是否支持自提", nullable = false)
    private Boolean isSelfMention;

    @TModelField(name = "店铺名称")
    @NotNull(message = "名称不能为空")
    private String name;

    @TModelField(name = "店铺状态")
    @DictionaryMeta(clazz = BusinessEntityStatusDict.class)
    private String status;

    @AddressMeta(containsPostcode = false)
    @TModelField(name = "店铺地址")
    private Address address;

    @TModelField(name = "图片", type = TModelFieldType.Image)
    private String logo;

    @TModelField(name = "简介")
    private String desc;

    @TModelField(name = "地址坐标经度")
    private String longitude;

    @TModelField(name = "地址坐标纬度")
    private String latitude;

    @TModelField(name = "联系人姓名")
    private String contactName;

    @TModelField(name = "联系人手机")
    private String contactPhone;

    @TModelField(name = "所属企业")
    @NotNull(message = "所属企业不能为空")
    @RelationMeta(name = "RelegationMDEnterpriseVO", modelClass = MDEnterpriseVO.class)
    private MDEnterpriseVO relegationEnterprise;

    @TModelField(name = "经营企业")
    @RelationMeta(name = "ManageMDEnterpriseVO", modelClass = MDEnterpriseVO.class)
    private MDEnterpriseVO manageEnterprise;

    @TModelField(name = "店铺编码")
    private String code;

    @TModelField(name = "店铺类型")
    private String shopType;

    @TModelField(name = "关联渠道")
    @NotNull(message = "归属渠道不能为空")
    @RelationMeta(name = "MDChannelVO", modelClass = MDChannelVO.class)
    private MDChannelVO channel;

    @TModelField(name = "accessToken")
    private String accessToken;

    @TModelField(name = "appKey")
    private String appKey;

    @TModelField(name = "appSecret")
    private String appSecret;

    @TModelField(name = "gateWay")
    private String gateWay;

    @TModelField(name = "outCode")
    private String outCode;

    @TModelField(name = "上架是否审核")
    private Boolean myIsOnShelfAudit;
}
