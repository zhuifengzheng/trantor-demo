/*
 * Copyright (c) 2020. 杭州端点网络科技有限公司.  All rights reserved.
 */

package io.terminus.trantor.demo.model.facade.response;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.terminus.api.response.info.ApiExtInfo;
import io.terminus.trantor.module.base.model.User;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Date;

/**
 * @author lsk mailto:liushaokang@terminus.io
 * @create 2020-06-09 5:49 下午
 **/
@Data
@ApiModel
@EqualsAndHashCode(callSuper = true)
public abstract class MasterDataAbstractInfo extends ApiExtInfo {

    @ApiModelProperty("创建时间")
    private Date createdAt;

    @ApiModelProperty("更新时间")
    private Date updatedAt;

    @ApiModelProperty("创建人")
    private User createdBy;

    @ApiModelProperty("更新人")
    private User updatedBy;
}
