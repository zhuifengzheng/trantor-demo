/*
 * Copyright (c) 2020. 杭州端点网络科技有限公司.  All rights reserved.
 */

package io.terminus.trantor.demo.action;

import io.terminus.common.model.Response;
import io.terminus.trantor.demo.model.b2c.MDShopVO;
import io.terminus.trantor.demo.model.facade.MDShopReadFacade;
import io.terminus.trantor.demo.model.facade.request.MDShopFindByIdRequest;
import io.terminus.trantor.exception.ActionErrorException;
import io.terminus.trantor.sdk.datasource.SingleDataAction;
import io.terminus.trantor.sdk.query.QueryValues;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.Objects;

/**
 * @author lsk mailto:liushaokang@terminus.io
 * @create 2020-07-07 4:12 下午
 **/
@Slf4j
@Component
@RequiredArgsConstructor
public class MDShopSingleDataAction implements SingleDataAction<MDShopVO> {
    private final MDShopReadFacade readFacade;

    @Override
    public MDShopVO load(QueryValues queryValues) {
        Object obj = queryValues.getOneValue("id");
        if (Objects.isNull(obj)) {
            return null;
        }
        Long id = Long.parseLong(obj.toString());

        MDShopFindByIdRequest request = new MDShopFindByIdRequest();
        request.setId(id);
//        Response<MDShopFullInfo> getRes = readFacade.findById(request);
//        if (!getRes.isSuccess()) {
//            throw new ActionErrorException(getRes.getError());
//        }
//
//        return MDShopConverter.convertFromMDShopFullInfo(getRes.getResult());
        return null;
    }
}
