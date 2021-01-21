/*
 * Copyright (c) 2020. 杭州端点网络科技有限公司.  All rights reserved.
 */

package io.terminus.trantor.demo.model.facade.request;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.terminus.api.consts.OperationType;
import io.terminus.api.utils.ParamUtil;
import io.terminus.trantor.api.annotation.type.Address;
import io.terminus.trantor.demo.model.facade.enums.ShopOperationType;
import io.terminus.trantor.demo.model.facade.param.CertificationAttributeParam;
import lombok.*;

import java.util.Date;

/**
 * @author lsk mailto:liushaokang@terminus.io
 * @create 2020-06-16 2:44 下午
 **/
@Data
@ApiModel
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class MDShopUpdateRequest extends MasterDataAbstractRequest {
    private static final long serialVersionUID = 5625679238516108278L;

    @ApiModelProperty(value = "店铺ID", required = true)
    private Long id;

    @ApiModelProperty(value = "店铺名称")
    private String name;

    @ApiModelProperty("是否支持自提")
    private Boolean isSelfMention;

    @ApiModelProperty(value = "店铺状态")
    private String status;

    @ApiModelProperty(value = "所属企业ID")
    private Long relegationEnterpriseId;

    @ApiModelProperty(value = "经营企业ID")
    private Long manageEnterpriseId;

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

    @ApiModelProperty(value = "关联渠道ID")
    private Long channelId;

    @ApiModelProperty(value = "图片")
    private String logo;

    @ApiModelProperty(value = "描述")
    private String desc;

    @ApiModelProperty(value = "认证信息")
    private CertificationAttributeParam certificationAttributeParam;

    @ApiModelProperty(value = "店铺地址对象")
    private Address address;

    @ApiModelProperty(value = "上架是否审核")
    private Boolean myIsOnShelfAudit;

    @ApiModelProperty("外部编码")
    private String outCode;

    @ApiModelProperty(name = "阶段")
    private String stage;

    @ApiModelProperty(name = "上级实体")
    private Long parentEntityId;

    @ApiModelProperty(name = "层级")
    private Integer level;

    @ApiModelProperty(name = "是否末级")
    private boolean isLastStage;

    @ApiModelProperty(name = "手机国际区号")
    private String mobileCode;

    @ApiModelProperty(name = "上班时间")
    private Date onWorkTime;

    @ApiModelProperty(name = "下班时间")
    private Date offWorkTime;

    @Override
    public OperationType getOperationType() {
        return ShopOperationType.SHOP_UPDATE;
    }

    @Override
    public void checkParam() {
        super.checkParam();

        ParamUtil.nonNull(id, "MDUpdateShopRequest.idCannotBeNull");
        ParamUtil.nonNull(relegationEnterpriseId, "MDUpdateShopRequest.relegationEnterpriseIdCannotBeNull");
        ParamUtil.nonNull(address, "MDUpdateShopRequest.addressCannotBeNull");
    }
}
