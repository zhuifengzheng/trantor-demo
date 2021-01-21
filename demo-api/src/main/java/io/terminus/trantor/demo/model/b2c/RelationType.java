/*
 * Copyright (c) 2020. 杭州端点网络科技有限公司.  All rights reserved.
 */

package io.terminus.trantor.demo.model.b2c;

import io.terminus.trantor.api.annotation.TDict;
import io.terminus.trantor.api.annotation.typemeta.Label;
import lombok.Data;

/**
 * @author <a href="mailto:yuancheng.cyc@alibaba-inc.com">yuancheng.cyc</a>
 * @description:
 * @date Create on 2020/8/11
 * @since version1.0 Copyright 2020 terminus.io All Rights Reserved.
 */
@TDict(name = "关系类型")
public class RelationType {

    @Label(value = "平台仓")
    public static final String ENTERPRISE = "ENTERPRISE";

    @Label(value = "店仓")
    public static final String SHOP = "SHOP";

}
