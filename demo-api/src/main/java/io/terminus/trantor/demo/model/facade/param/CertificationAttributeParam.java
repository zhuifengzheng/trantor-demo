/*
 * Copyright (c) 2020. 杭州端点网络科技有限公司.  All rights reserved.
 */

package io.terminus.trantor.demo.model.facade.param;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.terminus.api.request.param.ApiParam;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author lsk mailto:liushaokang@terminus.io
 * @create 2020-06-16 3:09 下午
 **/
@Data
@ApiModel
@EqualsAndHashCode(callSuper = true)
public class CertificationAttributeParam extends ApiParam {

    @ApiModelProperty("accessToken")
    private String accessToken;

    @ApiModelProperty("appKey")
    private String appKey;

    @ApiModelProperty("appSecret")
    private String appSecret;

    @ApiModelProperty("gateWay")
    private String gateWay;
}
