/*
 * Copyright (c) 2020. 杭州端点网络科技有限公司.  All rights reserved.
 */

package io.terminus.trantor.demo.action;

import cn.hutool.json.JSONUtil;
import com.google.common.base.Throwables;
import com.google.common.collect.Maps;
import io.terminus.api.utils.JsonUtil;
import io.terminus.trantor.api.annotation.TAction;
import io.terminus.trantor.api.annotation.params.Valid;
import io.terminus.trantor.api.annotation.type.Address;
import io.terminus.trantor.demo.model.b2c.B2cMDShopVO;
import io.terminus.trantor.demo.model.b2c.MDChannelVO;
import io.terminus.trantor.demo.model.b2c.MDEnterpriseVO;
import io.terminus.trantor.demo.model.facade.MDShopReadFacade;
import io.terminus.trantor.demo.model.facade.response.ShopAccessTokenInfo;
import io.terminus.trantor.exception.ActionErrorException;
import io.terminus.trantor.module.base.model.User;
import io.terminus.trantor.sdk.action.ActionBusinessMessage;
import io.terminus.trantor.sdk.datasource.SingleDataAction;
import io.terminus.trantor.sdk.exception.BusinessException;
import io.terminus.trantor.sdk.params.Load;
import io.terminus.trantor.sdk.query.QueryValues;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import okhttp3.*;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import java.io.IOException;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author lsk mailto:liushaokang@terminus.io
 * @create 2020-07-07 4:12 下午
 **/
@Slf4j
@Component
@RequiredArgsConstructor
public class B2cMDShopAction{
    private final MDShopReadFacade readFacade;


    @TAction(modelClass = B2cMDShopVO.class)
    public Boolean checkToken(B2cMDShopVO mdShopVO) {
        try {
            // todo 根据店铺id查询授权token，然后检验token是否可以使用
            Long id = mdShopVO.getId();
            log.info("checkToken shopId=>{}",id);
//            readFacade
            return true;
        } catch (Exception e) {
            throw new RuntimeException(Throwables.getStackTraceAsString(e));
        }
    }

    @TAction(modelClass = B2cMDShopVO.class)
    public void grantSynchronized(B2cMDShopVO mdShopVO) {
        log.info("===============grantSynchronized===================");
    }

    @TAction(modelClass = B2cMDShopVO.class)
    public String grant(B2cMDShopVO mdShopVO) {
        try {
            String grantUrl = "https://auth.lazada.com/oauth/authorize?response_type=code&force_auth=true&redirect_uri=https://trantor-portal-dev-9078-app.app.terminus.io/view/master_data_admin_MDShopVO_mDShop_grant_code&client_id=124923&country=" + mdShopVO.getCountryCode();// + 111111;
            log.info("认证授权地址：" + grantUrl);
            return grantUrl;
        } catch (Exception e) {
            log.error("生成认证地址失败 {}", Throwables.getStackTraceAsString(e));
            throw new RuntimeException(Throwables.getStackTraceAsString(e));
        }
    }

    @TAction(modelClass = B2cMDShopVO.class)
    public Boolean grantAuthorizationSave(B2cMDShopVO b2cMDShopVO) {
        String url = "https://dalaran-runtime-dev-t.app.terminus.io/lazada/token/create";
        Map<String, String> map = new HashMap<>();
        map.put("appKey", "124923");
        map.put("appSecret", "BtPwqWoyErRwsaDkU3tasJXRds424XKR");
        map.put("code", b2cMDShopVO.getGrantCode());//0_124923_Bb3TfpW4v1GOTidDt82Tjfbl67311
        Response response = postUrl(url, map);
        if (response == null || (response != null && !response.isSuccessful())) {
            throw new RuntimeException("请求授权接口错误...");
        }

        try {
            String resultJson = response.body().string();
            log.info("==============resultJson: {}", resultJson);

            ShopAccessTokenInfo result = JsonUtil.getObject(resultJson, new ShopAccessTokenInfo().getClass());

            if (StringUtils.isEmpty(result.getAccess_token())) {
                log.error("获取accessToken失败，造成原因:{}", result.getMessage());
                //return ActionBusinessMessage.error("获取accessToken失败，请检查授权码是否正确");
                throw new ActionErrorException("获取accessToken失败，请检查授权码是否正确");
            }
            // todo 这里保存到shop的扩展字段里面   将access_token保存到redis，并通定时【6天】过refresh_token刷新token
            // todo 更新 grantAuthorization=1

        } catch (IOException e) {
            e.printStackTrace();
        }

        // todo 这里通过token调用接口检验，能成功访问返回'成功'，失败返回'授权码错误'；
        //  或者返回true或者false，然后前台判断，然后报不同的信息框

        return true;
    }

    private static Response postUrl(String url, Map<String, String> params) {
        OkHttpClient okHttpClient = new OkHttpClient();
        MediaType mediaType = MediaType.get("application/json;charset=utf-8");
        final String content = JSONUtil.toJsonStr(params);
//        FormBody.Builder formBodyBuilder = new FormBody.Builder();

//        params.entrySet().forEach(m -> {
//            formBodyBuilder.add(m.getKey(),m.getValue());
//        });
//
//        FormBody body = formBodyBuilder.build();
        RequestBody body = RequestBody.create(mediaType, content);
        Request request = new Request.Builder()
                .url(url)
                .post(body)
                .build();
        Call call = okHttpClient.newCall(request);
        Response response = null;
        try {
            response = call.execute();
//            System.out.println(response.body().string());
        } catch (IOException e) {
            e.printStackTrace();
        }
        return response;
    }

}
