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
 * @create 2020-07-06 2:36 下午
 **/
@Data
@ApiModel
@EqualsAndHashCode(callSuper = true)
public class MDChannelInfo extends MasterDataAbstractInfo {

    @ApiModelProperty(value = "渠道ID")
    private Long id;

    @ApiModelProperty("渠道经营主体")
    private MDEnterpriseInfo enterprise;

    @ApiModelProperty("渠道名称")
    private String name;

    @ApiModelProperty("渠道编码")
    private String code;

    @ApiModelProperty("渠道类型")
    private String type;

    @ApiModelProperty("渠道状态")
    private String status;

    @ApiModelProperty("渠道分类")
    private String classification;

    @ApiModelProperty("渠道描述")
    private String desc;

    @ApiModelProperty("渠道经营类型")
    private String manageType;
}
