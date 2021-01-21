/*
 * Copyright (c) 2020. 杭州端点网络科技有限公司.  All rights reserved.
 */

package io.terminus.trantor.demo.action;

import com.google.common.collect.Maps;
import io.terminus.common.model.Paging;
import io.terminus.common.model.Response;
import io.terminus.draco.web.autoconfig.context.UserContext;
import io.terminus.trantor.api.annotation.type.Address;
import io.terminus.trantor.demo.action.converter.MDShopConverter;
import io.terminus.trantor.demo.action.util.ParamProcessUtil;
import io.terminus.trantor.demo.model.b2c.MDShopVO;
import io.terminus.trantor.demo.model.facade.MDEnterpriseUserReadFacade;
import io.terminus.trantor.demo.model.facade.MDShopReadFacade;
import io.terminus.trantor.demo.model.facade.request.MDEnterpriseUserFindByUserIdRequest;
import io.terminus.trantor.demo.model.facade.request.MDShopPageRequest;
import io.terminus.trantor.demo.model.facade.response.*;
import io.terminus.trantor.exception.ActionErrorException;
import io.terminus.trantor.module.base.model.User;
import io.terminus.trantor.sdk.datasource.MultiDataAction;
import io.terminus.trantor.sdk.datasource.MultiDataParams;
import io.terminus.trantor.sdk.datasource.MultiDataResult;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;

/**
 * @author lsk mailto:liushaokang@terminus.io
 * @create 2020-08-01 7:00 下午
 **/
@Slf4j
@Component
@RequiredArgsConstructor
public class MDMerchantShopMultiAction implements MultiDataAction<MDShopVO> {
    private final MDShopReadFacade readFacade;
    private final MDEnterpriseUserReadFacade enterpriseUserReadFacade;

    @Override
    public MultiDataResult<MDShopVO> load(MultiDataParams multiDataParams) {
//        Long userId = UserContext.getUserId();
//        if (Objects.isNull(userId)) {
//            return new MultiDataResult<>();
//        }

//        MDEnterpriseUserFindByUserIdRequest findEnterpriseUserRequest = new MDEnterpriseUserFindByUserIdRequest();
//        findEnterpriseUserRequest.setUserId(1L);
//        Response<MDEnterpriseUserInfo> enterpriseUserInfoResponse = enterpriseUserReadFacade.findUserRelegationEnterprise(findEnterpriseUserRequest);
//        if (!enterpriseUserInfoResponse.isSuccess()) {
//            throw new ActionErrorException(enterpriseUserInfoResponse.getError());
//        }
//        MDEnterpriseUserInfo enterpriseUserInfo = enterpriseUserInfoResponse.getResult();
//        if (Objects.isNull(enterpriseUserInfo)) {
//            return new MultiDataResult<>();
//        }
//        MDEnterpriseInfo enterpriseInfo = enterpriseUserInfo.getEnterpriseInfo();
//        if (Objects.isNull(enterpriseInfo)) {
//            return new MultiDataResult<>();
//        }
//
//        MDShopPageRequest request = ParamProcessUtil.dataParam2Object(multiDataParams, MDShopPageRequest.class);
//        request.setRelegationEnterpriseId(enterpriseInfo.getId());
//        Response<Paging<MDShopFullInfo>> getRes = readFacade.page(request);
//        if (!getRes.isSuccess()) {
//            throw new ActionErrorException(getRes.getError());
//        }
//        Paging<MDShopFullInfo> pageData = getRes.getResult();
        MDShopPageRequest request = ParamProcessUtil.dataParam2Object(multiDataParams, MDShopPageRequest.class);
        Response<Paging<MDShopFullInfo>> getRes = readFacade.page(request);
        List<MDShopFullInfo> data =
                getRes.getResult().getData();
        data.addAll(getMdShopFullInfo());
        if (!getRes.isSuccess()) {
            throw new ActionErrorException(getRes.getError());
        }
        Paging<MDShopFullInfo> pageData = getRes.getResult();
        return new MultiDataResult<>(MDShopConverter.converter(pageData.getData()), pageData.getTotal());
    }

    private List<MDShopFullInfo> getMdShopFullInfo(){
        List<MDShopFullInfo> shopFullInfos = new ArrayList<>();
        MDShopFullInfo info1 = new MDShopFullInfo();
        info1.setId(0L);
        info1.setName("");
        info1.setCode("");
        info1.setIsSelfMention(false);
        info1.setStatus("");
        info1.setRelegationEnterpriseInfo(new MDEnterpriseInfo());
        info1.setManageEnterpriseInfo(new MDEnterpriseInfo());
        info1.setContactName("");
        info1.setContactPhone("");
        info1.setLongitude("");
        info1.setLatitude("");
        info1.setShopType("");
        info1.setChannelInfo(new MDChannelInfo());
        info1.setCertificationAttributeInfo(new CertificationAttributeInfo());
        info1.setAddress(new Address());
        info1.setLogo("");
        info1.setDesc("");
        info1.setOutCode("");
        info1.setMyIsOnShelfAudit(false);
        info1.setStage("");
        info1.setParentEntity(new MDShopFullInfo());
        info1.setLevel(0);
        info1.setIsLastStage(false);
        info1.setMobileCode("");
        info1.setOnWorkTime(new Date());
        info1.setOffWorkTime(new Date());
        info1.setCreatedAt(new Date());
        info1.setUpdatedAt(new Date());
        info1.setCreatedBy(new User());
        info1.setUpdatedBy(new User());
        info1.setTenantId(0);
        info1.setTenantIdLong(0L);
        info1.setExtra(Maps.newHashMap());

        shopFullInfos.add(info1);

        MDShopFullInfo info2 = new MDShopFullInfo();
        info2.setId(0L);
        info2.setName("");
        info2.setCode("");
        info2.setIsSelfMention(false);
        info2.setStatus("");
        info2.setRelegationEnterpriseInfo(new MDEnterpriseInfo());
        info2.setManageEnterpriseInfo(new MDEnterpriseInfo());
        info2.setContactName("");
        info2.setContactPhone("");
        info2.setLongitude("");
        info2.setLatitude("");
        info2.setShopType("");
        info2.setChannelInfo(new MDChannelInfo());
        info2.setCertificationAttributeInfo(new CertificationAttributeInfo());
        info2.setAddress(new Address());
        info2.setLogo("");
        info2.setDesc("");
        info2.setOutCode("");
        info2.setMyIsOnShelfAudit(false);
        info2.setStage("");
        info2.setParentEntity(new MDShopFullInfo());
        info2.setLevel(0);
        info2.setIsLastStage(false);
        info2.setMobileCode("");
        info2.setOnWorkTime(new Date());
        info2.setOffWorkTime(new Date());
        info2.setCreatedAt(new Date());
        info2.setUpdatedAt(new Date());
        info2.setCreatedBy(new User());
        info2.setUpdatedBy(new User());
        info2.setTenantId(0);
        info2.setTenantIdLong(0L);
        info2.setExtra(Maps.newHashMap());

        shopFullInfos.add(info2);

        return shopFullInfos;

    }

}
