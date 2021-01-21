/*
 * Copyright (c) 2020. 杭州端点网络科技有限公司.  All rights reserved.
 */

package io.terminus.trantor.demo.facade;
import io.terminus.trantor.demo.model.facade.response.MDPositionInfo;
import io.terminus.trantor.module.base.model.User;
import com.google.common.collect.Lists;
import java.util.Date;
import io.terminus.trantor.demo.model.facade.response.MDEnterpriseInfo;
import io.terminus.trantor.api.annotation.type.Address;
import io.terminus.trantor.demo.model.facade.response.MDDepartmentInfo;
import com.google.common.collect.Maps;

import io.terminus.common.model.Paging;
import io.terminus.common.model.Response;
import io.terminus.trantor.demo.model.facade.MDEnterpriseUserReadFacade;
import io.terminus.trantor.demo.model.facade.request.MDEnterpriseUserFindByUserIdRequest;
import io.terminus.trantor.demo.model.facade.response.MDEnterpriseUserInfo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author lsk mailto:liushaokang@terminus.io
 * @create 2020-07-09 4:03 下午
 **/
@Component
@RequiredArgsConstructor
public class MDEnterpriseUserReadFacadeImpl implements MDEnterpriseUserReadFacade {
//    private final MDEnterpriseUserManage enterpriseUserManage;

    @Override
    public Response<MDEnterpriseUserInfo> findUserRelegationEnterprise(MDEnterpriseUserFindByUserIdRequest request) {
        MDEnterpriseUserInfo info = new MDEnterpriseUserInfo();
        info.setEnterprise(new MDEnterpriseInfo());
        info.setId(0L);
        info.setUserId(0L);
        info.setUsername("");
        info.setNickname("");
        info.setMobile("");
        info.setAdmin(false);
        info.setCode("");
        info.setEnterpriseInfo(new MDEnterpriseInfo());
        info.setEmail("");
        info.setDepartment(new MDDepartmentInfo());
        info.setPosition(new MDPositionInfo());
        info.setPartTimePosition(Lists.newArrayList());
        info.setEntryTime(new Date());
        info.setDesc("");
        info.setStatus("");
        info.setEnable(false);
        info.setName("");
        info.setAddress(new Address());
        info.setWorkplace("");
        info.setEnterpriseOrg(new MDEnterpriseInfo());
        info.setType("");
        info.setCreatedAt(new Date());
        info.setUpdatedAt(new Date());
        info.setCreatedBy(new User());
        info.setUpdatedBy(new User());
        info.setTenantId(0);
        info.setTenantIdLong(0L);
        info.setExtra(Maps.newHashMap());

        return Response.ok(info);
    }

//    @Override
//    public Response<MDEnterpriseUserInfo> findEnterpriseUserCacheByUserId(MDEnterpriseUserFindByUserIdRequest request) {
//        return Response.ok(enterpriseUserManage.findEnterpriseUserCacheByUserId(request.getUserId()));
//    }
//
//    @Override
//    public Response<Paging<MDEnterpriseUserInfo>> page(MDEnterpriseUserPageRequest request) {
//        return Response.ok(enterpriseUserManage.page(request));
//    }
//
//    @Override
//    public Response<MDEnterpriseUserInfo> findById(MDEnterpriseUserFindByIdRequest request) {
//        return Response.ok(enterpriseUserManage.findById(request.getId()));
//    }
//
//    @Override
//    public Response<MDEnterpriseUserInfo> findCacheById(MDEnterpriseUserFindByIdRequest request) {
//        return Response.ok(enterpriseUserManage.findCacheById(request.getId()));
//    }
//
//    @Override
//    public Response<List<MDEnterpriseUserInfo>> findByName(MDEnterpriseUserFindByNameRequest request) {
//        return Response.ok(MDEnterpriseUserConverter.converter(enterpriseUserManage.findByName(request.getName())));
//    }
//
//    @Override
//    public Response<List<MDEnterpriseUserInfo>> findByIds(MDEnterpriseUserFindByIdsRequest request) {
//        return Response.ok(enterpriseUserManage.findByIds(request.getIds()));
//    }
//
//    @Override
//    public Response<List<MDEnterpriseUserInfo>> findByPositionId(MDEnterpriseUserFindByPositionIdRequest request) {
//        return Response.ok(enterpriseUserManage.findByPostitionId(request.getPositionId()));
//    }
//
//    @Override
//    public Response<Paging<MDEnterpriseUserInfo>> page(MDEnterpriseStaffPageRequest request) {
//        return Response.ok(enterpriseUserManage.page(request));
//    }
//
//    @Override
//    public Response<Paging<TransporterInfo>> transportPage(TransporterPageRequest request) {
//        return Response.ok(enterpriseUserManage.transportPage(request));
//    }
}
