/*
 * Copyright (c) 2020. 杭州端点网络科技有限公司.  All rights reserved.
 */

package io.terminus.trantor.demo.action;

import com.google.common.base.Throwables;
import io.terminus.trantor.api.TContext;
import io.terminus.trantor.api.annotation.TAction;
import io.terminus.trantor.module.base.model.User;
import io.terminus.trantor.demo.model.b2c.MDChannelVO;

import java.io.IOException;
import java.util.Date;

import io.terminus.trantor.api.annotation.type.Address;
import io.terminus.trantor.demo.model.b2c.MDEnterpriseVO;
import com.google.common.collect.Maps;

import io.terminus.common.model.Response;
import io.terminus.trantor.demo.model.b2c.B2cMDShopVO;
import io.terminus.trantor.demo.model.b2c.MDShopVO;
import io.terminus.trantor.demo.model.facade.MDShopReadFacade;
import io.terminus.trantor.demo.model.facade.request.MDShopFindByIdRequest;
import io.terminus.trantor.exception.ActionErrorException;
import io.terminus.trantor.sdk.datasource.SingleDataAction;
import io.terminus.trantor.sdk.datasource.SingleDataParams;
import io.terminus.trantor.sdk.query.QueryValue;
import io.terminus.trantor.sdk.query.QueryValues;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.apache.tomcat.util.http.fileupload.RequestContext;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
import org.springframework.web.servlet.support.RequestContextUtils;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Objects;

/**
 * @author lsk mailto:liushaokang@terminus.io
 * @create 2020-07-07 4:12 下午
 **/
@Slf4j
@Component
@RequiredArgsConstructor
public class B2cMDShopSingleDataAction implements SingleDataAction<B2cMDShopVO> {
    private final MDShopReadFacade readFacade;

    @TAction(modelClass = B2cMDShopVO.class)
    public String grant() {
        try {
            String grantUrl = "https://auth.lazada.com/oauth/authorize?response_type=code&force_auth=true&redirect_uri=https://work.terminus.io&client_id=124923";// + 124923;
            log.info("认证授权地址：" + grantUrl);
            return grantUrl;
        } catch (Exception e) {
            log.error("生成认证地址失败 {}", Throwables.getStackTraceAsString(e));
            throw new RuntimeException(Throwables.getStackTraceAsString(e));
        }
    }

    @Override
    public B2cMDShopVO load(QueryValues queryValues) {
//        Object obj = queryValues.getOneValue("id");
//        if (Objects.isNull(obj)) {
//            return null;
//        }
//        Long id = Long.parseLong(obj.toString());
//
//        MDShopFindByIdRequest request = new MDShopFindByIdRequest();
//        request.setId(id);
//        Response<MDShopFullInfo> getRes = readFacade.findById(request);
//        if (!getRes.isSuccess()) {
//            throw new ActionErrorException(getRes.getError());
//        }
//
//        return MDShopConverter.convertFromMDShopFullInfo(getRes.getResult());
        B2cMDShopVO shopVO = new B2cMDShopVO();
        shopVO.setGrantAuthorization(0);
        shopVO.setIsSelfMention(false);
        shopVO.setName("店铺名称");
        shopVO.setStatus("");
        shopVO.setAddress(new Address());
        shopVO.setLogo("logo");
        shopVO.setDesc("");
        shopVO.setLongitude("");
        shopVO.setLatitude("");
        shopVO.setContactName("xxx公司名称");
        shopVO.setContactPhone("");
        shopVO.setRelegationEnterprise(new MDEnterpriseVO());
        shopVO.setManageEnterprise(new MDEnterpriseVO());
        shopVO.setCode("");
        shopVO.setShopType("");
        shopVO.setChannel(new MDChannelVO().setName("xxx渠道"));
        shopVO.setAccessToken("");
        shopVO.setAppKey("124923"); // 授权key
        shopVO.setAppSecret("BtPwqWoyErRwsaDkU3tasJXRds424XKR");
        shopVO.setGateWay("");
        shopVO.setOutCode("");
        shopVO.setMyIsOnShelfAudit(false);
        shopVO.setCreatedAt(new Date());
        shopVO.setUpdatedAt(new Date());
        shopVO.setIsDeleted(false);
        shopVO.setCreatedBy(new User());
        shopVO.setUpdatedBy(new User());
        shopVO.set_fields(Maps.newHashMap());
        shopVO.set__trantorExtendFields(Maps.newHashMap());


        // todo 添加appkey参数
        return shopVO;
    }
}
