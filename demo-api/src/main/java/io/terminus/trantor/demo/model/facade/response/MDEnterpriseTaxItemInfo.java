/*
 * Copyright (c) 2020. 杭州端点网络科技有限公司.  All rights reserved.
 */

package io.terminus.trantor.demo.model.facade.response;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Date;

/**
 * @author lsk mailto:liushaokang@terminus.io
 * @create 2020-08-21 11:06 上午
 **/
@Data
@ApiModel
@EqualsAndHashCode(callSuper = true)
public class MDEnterpriseTaxItemInfo extends MasterDataAbstractInfo {
    private static final long serialVersionUID = 5317057177447628467L;

    @ApiModelProperty("税目ID")
    private Long id;

    @ApiModelProperty("企业ID")
    private Long enterpriseId;

    @ApiModelProperty("纳税人名称")
    private String taxpayer;

    @ApiModelProperty("应税类别")
    private String taxableType;

    @ApiModelProperty("税率")
    private String taxRate;

    @ApiModelProperty("税代码")
    private String taxCode;

    @ApiModelProperty("有效开始日期")
    private Date startAt;

    @ApiModelProperty("有效结束日期")
    private Date endAt;

    @ApiModelProperty("是否长期有效")
    private Boolean isLongTerm;
}
