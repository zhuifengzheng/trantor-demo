/*
 * Copyright (c) 2020. 杭州端点网络科技有限公司.  All rights reserved.
 */

package io.terminus.trantor.demo.model.b2c;

import io.terminus.trantor.api.annotation.TDict;
import io.terminus.trantor.api.annotation.typemeta.Label;

/**
 * @author lsk mailto:liushaokang@terminus.io
 * @create 2020-06-15 2:19 下午
 **/
@TDict(name = "渠道经营类型")
public class ChannelManageTypeDict {

    @Label("内部渠道")
    public static final String internal = "internal";

    @Label("外部渠道")
    public static final String external = "external";
}
