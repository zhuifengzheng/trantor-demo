/*
 * Copyright (c) 2020. 杭州端点网络科技有限公司.  All rights reserved.
 */

package io.terminus.trantor.demo.model.facade.enums;

import io.terminus.api.consts.OperationType;
import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author lsk mailto:liushaokang@terminus.io
 * @create 2020-06-16 2:43 下午
 **/
@Getter
@AllArgsConstructor
public enum ShopOperationType implements OperationType {
    SHOP_UPDATE("更新店铺", true),
    SHOP_CREATE("创建店铺", true),
    SHOP_FIND_BY_ID("通过ID查找店铺", false),
    SHOP_FIND_BY_RELEGATION_ENTERPRISE_ID("通过所属企业ID查找店铺", false),
    SHOP_FIND_BY_CHANNEL_ID("通过所属渠道ID查找店铺", false),
    PAGE_QUERY_SHOP("分页查找店铺", false);

    private final String description;
    private final boolean write;
}
