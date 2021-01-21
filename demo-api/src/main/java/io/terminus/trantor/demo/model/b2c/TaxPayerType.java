/*
 * Copyright (c) 2020. 杭州端点网络科技有限公司.  All rights reserved.
 */

package io.terminus.trantor.demo.model.b2c;

import io.terminus.trantor.api.annotation.TDict;
import io.terminus.trantor.api.annotation.typemeta.Label;

/**
 * @author lsk mailto:liushaokang@terminus.io
 * @create 2020-07-31 2:51 下午
 **/
@TDict(name = "纳税人类型")
public class TaxPayerType {

    @Label("一般纳税人")
    public static final String GENERAL = "general";

    @Label("小规模纳税人")
    public static final String SCALE = "scale";
}
