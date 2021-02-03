/*
 * Copyright (c) 2020. 杭州端点网络科技有限公司.  All rights reserved.
 */

package io.terminus.trantor.demo.action;

import cn.hutool.json.JSONUtil;
import com.google.common.base.Throwables;
import io.terminus.api.utils.JsonUtil;
import io.terminus.trantor.api.TContext;
import io.terminus.trantor.api.annotation.TAction;
import io.terminus.trantor.api.annotation.params.Valid;
import io.terminus.trantor.demo.address.AddressInfo;
import io.terminus.trantor.demo.model.facade.response.ShopAccessTokenInfo;
import io.terminus.trantor.module.base.model.User;
import io.terminus.trantor.demo.model.b2c.MDChannelVO;

import java.io.IOException;
import java.util.*;

import io.terminus.trantor.api.annotation.type.Address;
import io.terminus.trantor.demo.model.b2c.MDEnterpriseVO;
import com.google.common.collect.Maps;

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
import okhttp3.*;
import org.apache.tomcat.util.http.fileupload.RequestContext;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
import org.springframework.web.servlet.support.RequestContextUtils;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author lsk mailto:liushaokang@terminus.io
 * @create 2020-07-07 4:12 下午
 **/
@Slf4j
@Component
@RequiredArgsConstructor
public class B2cMDShopSingleDataAction implements SingleDataAction<B2cMDShopVO> {
    private final MDShopReadFacade readFacade;

//    @TAction(modelClass = B2cMDShopVO.class)
//    public String grant(B2cMDShopVO mdShopVO) {
//        try {
//            String grantUrl = "https://auth.lazada.com/oauth/authorize?response_type=code&force_auth=true&redirect_uri=https://work.terminus.io&client_id=124923&country=" + mdShopVO.getCountryCode();// + 111111;
//            log.info("认证授权地址：" + grantUrl);
//            return grantUrl;
//        } catch (Exception e) {
//            log.error("生成认证地址失败 {}", Throwables.getStackTraceAsString(e));
//            throw new RuntimeException(Throwables.getStackTraceAsString(e));
//        }
//    }
//
//    @TAction(modelClass = B2cMDShopVO.class)
//    public void grantAuthorizationSave(@Valid B2cMDShopVO b2cMDShopVO) {
////        接口地址：https://dalaran-runtime-dev-t.app.terminus.io/lazada/token/create
////        入参：{
////            "appKey": "124923",
////                    "appSecret": "BtPwqWoyErRwsaDkU3tasJXRds424XKR",
////                    "code": "0_124923_68gh4pzELpX2r0j9nLg6Akwa65427"
////        }
//        String url = "https://dalaran-runtime-dev-t.app.terminus.io/lazada/token/create";
//        Map<String, String> map = new HashMap<>();
//        map.put("appKey", "124923");
//        map.put("appSecret", "BtPwqWoyErRwsaDkU3tasJXRds424XKR");
//        map.put("code", b2cMDShopVO.getGrantCode());//0_124923_Bb3TfpW4v1GOTidDt82Tjfbl67311
//        Response response = postUrl(url, map);
//        if (response == null || (response != null && !response.isSuccessful())) {
//            throw new RuntimeException("请求授权接口错误...");
//        }
//
//        try {
//            String resultJson = response.body().string();
//            log.info("==============resultJson: {}", resultJson);
//
//            ShopAccessTokenInfo result = JsonUtil.getObject(resultJson, new ShopAccessTokenInfo().getClass());
//
//            if (StringUtils.isEmpty(result.getAccess_token())) {
//                log.error("获取accessToken失败，造成原因:{}", result.getMessage());
//                throw new RuntimeException("获取accessToken失败，请检查授权码是否正确");
//            }
//            // todo 这里保存到shop的扩展字段里面   将access_token保存到redis，并通定时【6天】过refresh_token刷新token
//            // todo 更新 grantAuthorization=1
//
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//
//    }
//
//    private static okhttp3.Response postUrl(String url, Map<String, String> params) {
//        OkHttpClient okHttpClient = new OkHttpClient();
//        MediaType mediaType = MediaType.get("application/json;charset=utf-8");
//        final String content = JSONUtil.toJsonStr(params);
////        FormBody.Builder formBodyBuilder = new FormBody.Builder();
//
////        params.entrySet().forEach(m -> {
////            formBodyBuilder.add(m.getKey(),m.getValue());
////        });
////
////        FormBody body = formBodyBuilder.build();
//        RequestBody body = RequestBody.create(mediaType, content);
//        Request request = new Request.Builder()
//                .url(url)
//                .post(body)
//                .build();
//        Call call = okHttpClient.newCall(request);
//        Response response = null;
//        try {
//            response = call.execute();
////            System.out.println(response.body().string());
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        return response;
//    }

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
        shopVO.setGrantAuthorization(false);
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
        shopVO.setId(queryValues.getOneValue("id"));
        Object obj = queryValues.getOneValue("id");
        if (shopVO.getGrantAuthorization()) {
            shopVO.setGrantProgress(0);
        }else {
            shopVO.setGrantProgress(1);
        }

        System.out.println("================queryValues.getOneValue(\"id\")=============="+obj);
        // todo 添加appkey参数

        HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();

        String code = request.getParameter("code");
        log.info("code===={}",code);
//        if (null == code){
//            shopVO.setGrantCode("111");
//        }else {
//            shopVO.setGrantCode(code);
//        }
        shopVO.setItemSynchronized(true);
        shopVO.setOrderSynchronized(false);
        return shopVO;
    }
}
