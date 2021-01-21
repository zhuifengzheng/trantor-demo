/*
 * Copyright (c) 2020. 杭州端点网络科技有限公司.  All rights reserved.
 */

package io.terminus.trantor.demo.model.b2c;

import io.terminus.trantor.api.annotation.TDict;
import io.terminus.trantor.api.annotation.typemeta.Label;

/**
 * @author lsk mailto:liushaokang@terminus.io
 * @create 2020-06-15 2:16 下午
 **/
@TDict(name = "渠道类型")
public class ChannelTypeDict {

    @Label("线上渠道")
    public static final String ONLINE = "ONLINE";

    @Label("线下渠道")
    public static final String OFFLINE = "OFFLINE";

}
