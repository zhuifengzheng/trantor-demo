/*
 * Copyright (c) 2020. 杭州端点网络科技有限公司.  All rights reserved.
 */

package io.terminus.trantor.demo.model.facade;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.terminus.common.model.Response;
import io.terminus.trantor.demo.model.facade.request.MDShopCreateRequest;
import io.terminus.trantor.demo.model.facade.request.MDShopUpdateRequest;

/**
 * 店铺写操作
 * @author lsk mailto:liushaokang@terminus.io
 * @create 2020-07-07 4:14 下午
 **/
@Api("店铺写操作")
public interface MDShopWriteFacade {

    /**
     * 创建店铺
     * @param request 请求
     * @return 创建成功的店铺ID
     */
    @ApiOperation("[店铺]创建店铺")
    Response<Long> create(MDShopCreateRequest request);

    /**
     * 更新店铺
     * @param request 请求
     * @return 操作是否成功
     */
    @ApiOperation("[店铺]更新店铺")
    Response<Boolean> update(MDShopUpdateRequest request);

}
