/*
 * Copyright (c) 2020. 杭州端点网络科技有限公司.  All rights reserved.
 */

package io.terminus.trantor.demo.model.facade.response;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.math.BigDecimal;

/**
 * @author lsk mailto:liushaokang@terminus.io
 * @create 2020-08-21 11:03 上午
 **/
@Data
@ApiModel
@EqualsAndHashCode(callSuper = true)
public class MDEnterpriseShareHolderInfo extends MasterDataAbstractInfo {
    private static final long serialVersionUID = 5476229593084826348L;

    @ApiModelProperty("股东ID")
    private Long id;

    @ApiModelProperty(value = "企业ID")
    private Long enterpriseId;

    @ApiModelProperty(value = "股东姓名")
    private String name;

    @ApiModelProperty(value = "证件类型")
    private String credentialsType;

    @ApiModelProperty(value = "证件号")
    private String legalRepresentativeId;

    @ApiModelProperty(value = "投资额")
    private BigDecimal investmentAmount;

    @ApiModelProperty(value = "投资比例")
    private BigDecimal investmentRate;

    @ApiModelProperty(value = "职务")
    private String jobTitle;
}
