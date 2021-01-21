/*
 * Copyright (c) 2020. 杭州端点网络科技有限公司.  All rights reserved.
 */

package io.terminus.trantor.demo.model.facade;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.terminus.common.model.Paging;
import io.terminus.common.model.Response;
import io.terminus.trantor.demo.model.facade.request.MDShopPageRequest;
import io.terminus.trantor.demo.model.facade.response.MDShopFullInfo;

import java.util.List;

/**
 * 店铺信息读服务
 * @author lsk mailto:liushaokang@terminus.io
 * @create 2020-06-16 2:47 下午
 **/
@Api("店铺信息读服务")
public interface MDShopReadFacade {

    /**
     * 通过一组业务实体ID集合查询店铺基础信息列表
     * @param request 请求
     * @return 店铺基础信息列表
     */
//    @ApiOperation("[店铺]通过业务实体ID集合查询店铺基础信息")
//    Response<List<MDShopThinInfo>> findByIds(MDShopFindByIdsRequest request);
//
//    /**
//     * 通过所属企业ID查询店铺完整信息(含企业、渠道、认证、地址信息)
//     * @param request 请求
//     * @return 店铺完整信息列表
//     */
//    @ApiOperation("[店铺]通过所属企业ID查询店铺完整信息")
//    Response<List<MDShopFullInfo>> findByRelegationEnterpriseId(MDShopFindByRelegationEnterpriseIdRequest request);
//
//    /**
//     * 通过所属渠道ID查询店铺完整信息(含企业、渠道、认证、地址信息)
//     * @param request 请求
//     * @return 店铺完整信息列表
//     */
//    @ApiOperation("[店铺]通过渠道ID查询店铺完整信息(含企业、渠道、认证、地址信息)")
//    Response<List<MDShopFullInfo>> findByChannelId(MDShopFindByChannelIdRequest request);
//
//    /**
//     * 通过ID查询店铺完整信息(含企业、渠道、认证、地址信息)
//     * @param request 请求
//     * @return 店铺完整信息
//     */
//    @ApiOperation("[店铺]通过ID查询店铺完整信息(含企业、渠道、认证、地址信息)")
//    Response<MDShopFullInfo> findById(MDShopFindByIdRequest request);

    /**
     * 通过所属企业ID查询店铺完整信息分页(含企业、渠道、认证、地址信息)
     * @param request 请求
     * @return 店铺完整信息分页
     */
    @ApiOperation("[店铺]分页查询店铺")
    Response<Paging<MDShopFullInfo>> page(MDShopPageRequest request);



//    @ApiOperation("[店铺]查询所有店铺信息")
//    Response<List<MDShopFullInfo>> findAll();
}
