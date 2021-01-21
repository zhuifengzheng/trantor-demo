/*
 * Copyright (c) 2020. 杭州端点网络科技有限公司.  All rights reserved.
 */

package io.terminus.trantor.demo.model.b2c;

import io.terminus.trantor.api.annotation.TDict;
import io.terminus.trantor.api.annotation.typemeta.Label;

/**
 * @author lsk mailto:liushaokang@terminus.io
 * @create 2020-06-15 2:53 下午
 **/
@TDict(name = "实体类型")
public class BusinessEntityTypeDict {

    @Label("门店")
    public static final String STORE = "STORE";

    @Label("店铺")
    public static final String SHOP = "SHOP";

    @Label("工厂")
    public static final String FACTORY = "FACTORY";

    @Label("工程")
    public static final String PROJECT = "PROJECT";
}
