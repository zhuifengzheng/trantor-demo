/*
 * Copyright (c) 2020. 杭州端点网络科技有限公司.  All rights reserved.
 */

package io.terminus.trantor.demo.model.facade.response;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.terminus.trantor.api.annotation.type.Address;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Date;

/**
 * @author lsk mailto:liushaokang@terminus.io
 * @create 2020-07-07 4:43 下午
 **/
@Data
@ApiModel
@EqualsAndHashCode(callSuper = true)
public class MDShopFullInfo extends MasterDataAbstractInfo {
    private static final long serialVersionUID = 6495726849920277288L;

    @ApiModelProperty(value = "店铺ID")
    private Long id;

    @ApiModelProperty(value = "店铺名称")
    private String name;

    @ApiModelProperty("店铺编码")
    private String code;

    @ApiModelProperty("是否支持自提")
    private Boolean isSelfMention;

    @ApiModelProperty("店铺状态")
    private String status;

    @ApiModelProperty(value = "所属企业")
    private MDEnterpriseInfo relegationEnterpriseInfo;

    @ApiModelProperty(value = "经营企业ID")
    private MDEnterpriseInfo manageEnterpriseInfo;

    @ApiModelProperty(value = "联系人姓名")
    private String contactName;

    @ApiModelProperty(value = "联系人手机")
    private String contactPhone;

    @ApiModelProperty(value = "地址坐标经度")
    private String longitude;

    @ApiModelProperty(value = "地址坐标纬度")
    private String latitude;

    @ApiModelProperty(value = "店铺类型")
    private String shopType;

    @ApiModelProperty(value = "关联渠道")
    private MDChannelInfo channelInfo;

    @ApiModelProperty(value = "认证信息")
    private CertificationAttributeInfo certificationAttributeInfo;

    @ApiModelProperty(value = "店铺地址对象")
    private Address address;

    @ApiModelProperty(value = "图片")
    private String logo;

    @ApiModelProperty(value = "描述")
    private String desc;

    @ApiModelProperty(value = "外部编码")
    private String outCode;

    @ApiModelProperty(value = "上架是否审核")
    private Boolean myIsOnShelfAudit;

    @ApiModelProperty(name = "阶段")
    private String stage;

    @ApiModelProperty(name = "上级实体")
    private MDShopFullInfo parentEntity;

    @ApiModelProperty(name = "层级")
    private Integer level;

    @ApiModelProperty(name = "是否末级")
    private Boolean isLastStage;

    @ApiModelProperty(name = "手机国际区号")
    private String mobileCode;

    @ApiModelProperty(name = "上班时间")
    private Date onWorkTime;

    @ApiModelProperty(name = "下班时间")
    private Date offWorkTime;

}
