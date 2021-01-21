/*
 * Copyright (c) 2020. 杭州端点网络科技有限公司.  All rights reserved.
 */

package io.terminus.trantor.demo.model.facade;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.terminus.common.model.Paging;
import io.terminus.common.model.Response;
import io.terminus.trantor.demo.model.facade.request.MDEnterpriseUserFindByUserIdRequest;
import io.terminus.trantor.demo.model.facade.response.MDEnterpriseUserInfo;

import java.util.List;


/**
 * 企业用户读服务
 * @author lsk mailto:liushaokang@terminus.io
 * @create 2020-06-30 10:06 上午
 **/
@Api("企业用户读服务")
public interface MDEnterpriseUserReadFacade {

    /**
     * 通过登录用户ID查询企业用户信息
     * @param request 请求
     * @return 企业用户信息
     */
    @ApiOperation("[企业用户]通过ID查询")
    Response<MDEnterpriseUserInfo> findUserRelegationEnterprise(MDEnterpriseUserFindByUserIdRequest request);


//    /**
//     * 通过登录ID查询企业用户信息(缓存)
//     * @param request 请求
//     * @return 企业用户信息
//     */
//    @ApiOperation("[企业用户]通过ID查询")
//    Response<MDEnterpriseUserInfo> findEnterpriseUserCacheByUserId(MDEnterpriseUserFindByUserIdRequest request);
//
//    @ApiOperation("[企业用户]分页查询")
//    Response<Paging<MDEnterpriseUserInfo>> page(MDEnterpriseUserPageRequest request);
//
//    @ApiOperation("[员工]根据id查询")
//    Response<MDEnterpriseUserInfo> findById(MDEnterpriseUserFindByIdRequest request);
//
//
//    @ApiOperation("[员工]根据id查询")
//    Response<MDEnterpriseUserInfo> findCacheById(MDEnterpriseUserFindByIdRequest request);
//
//    @ApiOperation("[员工]根据name查询")
//    Response<List<MDEnterpriseUserInfo>> findByName(MDEnterpriseUserFindByNameRequest request);
//
//    @ApiOperation("[员工]根据ids查询")
//    Response<List<MDEnterpriseUserInfo>> findByIds(MDEnterpriseUserFindByIdsRequest request);
//
//
//    @ApiOperation("[员工]根据ids查询")
//    Response<List<MDEnterpriseUserInfo>> findByPositionId(MDEnterpriseUserFindByPositionIdRequest request);
//
//    @ApiOperation("[员工]分页查询")
//    Response<Paging<MDEnterpriseUserInfo>> page(MDEnterpriseStaffPageRequest request);
//
//
//    @ApiOperation("[承运人]分页查询")
//    Response<Paging<TransporterInfo>> transportPage(TransporterPageRequest request);
}
