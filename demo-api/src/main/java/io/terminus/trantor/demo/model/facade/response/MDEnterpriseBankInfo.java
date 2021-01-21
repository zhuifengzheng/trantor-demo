/*
 * Copyright (c) 2020. 杭州端点网络科技有限公司.  All rights reserved.
 */

package io.terminus.trantor.demo.model.facade.response;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author lsk mailto:liushaokang@terminus.io
 * @create 2020-08-21 10:56 上午
 **/
@Data
@ApiModel
@EqualsAndHashCode(callSuper = true)
public class MDEnterpriseBankInfo extends MasterDataAbstractInfo {
    private static final long serialVersionUID = 652428743095305764L;

    @ApiModelProperty("银行ID")
    private Long id;

    @ApiModelProperty(value = "企业id")
    private Long enterpriseId;

    @ApiModelProperty(value = "开户银行")
    private String bankType;

    @ApiModelProperty(value = "开户名称")
    private String name;

    @ApiModelProperty(value = "银行账号")
    private String cardNo;

    @ApiModelProperty(value = "账户类型", notes = "收款账号-SK,付款账号-FK")
    private String accountType;

    @ApiModelProperty(value = "开户银行代码")
    private String bankCode;

    @ApiModelProperty(value = "适用范围")
    private String applyScope;

    @ApiModelProperty(value = "备注说明")
    private String desc;
}
