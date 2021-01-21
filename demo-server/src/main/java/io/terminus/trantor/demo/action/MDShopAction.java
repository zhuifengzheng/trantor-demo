///*
// * Copyright (c) 2020. 杭州端点网络科技有限公司.  All rights reserved.
// */
//
//package io.terminus.trantor.demo.action;
//
//import io.terminus.common.model.Response;
//import io.terminus.trantor.api.annotation.TAction;
//import io.terminus.trantor.api.annotation.params.Valid;
//import io.terminus.trantor.demo.model.b2c.MDShopVO;
//import io.terminus.trantor.exception.ActionErrorException;
//import io.terminus.trantor.sdk.params.Load;
//import lombok.RequiredArgsConstructor;
//import lombok.extern.slf4j.Slf4j;
//import org.springframework.stereotype.Component;
//
///**
// * @author lsk mailto:liushaokang@terminus.io
// * @create 2020-07-07 4:17 下午
// **/
//@Slf4j
//@Component
//@RequiredArgsConstructor
//public class MDShopAction {
//    private final MDShopWriteFacade writeFacade;
//
//    @TAction(modelClass = MDShopVO.class)
//    public void create(@Valid @Load MDShopVO shopVO) {
//        MDShopCreateRequest request = MDShopConverter.converter2Create(shopVO);
//        Response<Long> getRes = writeFacade.create(request);
//        if (!getRes.isSuccess()) {
//            throw new ActionErrorException(getRes.getError());
//        }
//    }
//
//    @TAction(modelClass = MDShopVO.class)
//    public void update(MDShopVO shopVO) {
//        MDShopUpdateRequest request = MDShopConverter.converter2Update(shopVO);
//        Response<Boolean> getRes = writeFacade.update(request);
//        if (!getRes.isSuccess()) {
//            throw new ActionErrorException(getRes.getError());
//        }
//    }
//}
