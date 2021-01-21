/*
 * Copyright (c) 2020. 杭州端点网络科技有限公司.  All rights reserved.
 */

package io.terminus.trantor.demo.facade;

import io.terminus.common.model.Paging;
import io.terminus.common.model.Response;
import io.terminus.trantor.demo.manager.MDShopManage;
import io.terminus.trantor.demo.model.facade.MDShopReadFacade;
import io.terminus.trantor.demo.model.facade.request.MDShopPageRequest;
import io.terminus.trantor.demo.model.facade.response.MDShopFullInfo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author lsk mailto:liushaokang@terminus.io
 * @create 2020-06-16 2:47 下午
 **/
@Component
@RequiredArgsConstructor
public class MDShopReadFacadeImpl implements MDShopReadFacade {
    private final MDShopManage manage;

//    @Override
//    public Response<List<MDShopThinInfo>> findByIds(MDShopFindByIdsRequest request) {
//        return Response.ok(manage.findByIds(request.getIds()));
//    }
//
//    @Override
//    public Response<List<MDShopFullInfo>> findByRelegationEnterpriseId(MDShopFindByRelegationEnterpriseIdRequest request) {
//        return Response.ok(manage.findByRelegationEnterpriseId(request.getRelegationEnterpriseId()));
//    }
//
//    @Override
//    public Response<List<MDShopFullInfo>> findByChannelId(MDShopFindByChannelIdRequest request) {
//        return Response.ok(manage.findByChannelId(request.getChannelId()));
//    }
//
//    @Override
//    public Response<MDShopFullInfo> findById(MDShopFindByIdRequest request) {
//        return Response.ok(manage.findById(request.getId()));
//    }

    @Override
    public Response<Paging<MDShopFullInfo>> page(MDShopPageRequest request) {
        return Response.ok(manage.page(request));
    }

//    @Override
//    public Response<List<MDShopFullInfo>> findAll() {
//        return Response.ok(manage.findAll());
//    }
}
