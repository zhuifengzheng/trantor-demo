package io.terminus.trantor.demo.model.b2c;

import io.terminus.trantor.api.annotation.TDict;
import io.terminus.trantor.api.annotation.typemeta.Label;

/**
 * @Author by yuanpeng
 * @Date 2021/1/20
 *
 */
@TDict(name = "店铺授权")
public class GrantAuthorizationStatusDict {
    @Label("已经授权")
    public static final int GRANT = 1;

    @Label("未授权")
    public static final int NO_GRANT = 0;
}
