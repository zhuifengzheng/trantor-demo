/*
 * Copyright (c) 2020. 杭州端点网络科技有限公司.  All rights reserved.
 */

package io.terminus.trantor.demo.model.b2c;

import io.terminus.trantor.api.annotation.TDict;
import io.terminus.trantor.api.annotation.typemeta.Label;

/**
 * @author lsk mailto:liushaokang@terminus.io
 * @create 2020-06-15 3:11 下午
 **/
@TDict(name = "业务实体状态")
public class BusinessEntityStatusDict {
    @Label("已启用")
    public static final String ENABLED = "ENABLED";

    @Label("已停用")
    public static final String DISABLED = "DISABLED";
}
