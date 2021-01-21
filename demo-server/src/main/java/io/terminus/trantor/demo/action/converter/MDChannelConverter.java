/*
 * Copyright (c) 2020. 杭州端点网络科技有限公司.  All rights reserved.
 */

package io.terminus.trantor.demo.action.converter;


import io.terminus.trantor.demo.model.b2c.MDChannelVO;
import io.terminus.trantor.demo.model.facade.response.MDChannelInfo;
import io.terminus.trantor.demo.model.facade.response.MDEnterpriseInfo;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

/**
 * @author lsk mailto:liushaokang@terminus.io
 * @create 2020-07-07 11:48 上午
 **/
public class MDChannelConverter {

    public static MDChannelVO converter(MDChannelInfo channelInfo) {
        if (Objects.isNull(channelInfo)) {
            return null;
        }
        MDChannelVO mDChannelVO = new MDChannelVO();
        mDChannelVO.setCode(channelInfo.getCode());
        mDChannelVO.setName(channelInfo.getName());
        mDChannelVO.setType(channelInfo.getType());
        mDChannelVO.setClassification(channelInfo.getClassification());
        mDChannelVO.setStatus(channelInfo.getStatus());
        mDChannelVO.setDesc(channelInfo.getDesc());
        mDChannelVO.setManageType(channelInfo.getManageType());
        mDChannelVO.setCreatedAt(channelInfo.getCreatedAt());
        mDChannelVO.setUpdatedAt(channelInfo.getUpdatedAt());
        mDChannelVO.setCreatedBy(channelInfo.getCreatedBy());
        mDChannelVO.setUpdatedBy(channelInfo.getUpdatedBy());
        mDChannelVO.setId(channelInfo.getId());

        MDEnterpriseInfo enterprise = channelInfo.getEnterprise();
        if (Objects.nonNull(enterprise)) {
            mDChannelVO.setEnterprise(MDEnterpriseConverter.converter(enterprise));
        }
        return mDChannelVO;

    }
}
