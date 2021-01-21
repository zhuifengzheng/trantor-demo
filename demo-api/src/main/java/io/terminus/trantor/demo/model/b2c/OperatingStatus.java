package io.terminus.trantor.demo.model.b2c;

import io.terminus.trantor.api.annotation.TDict;
import io.terminus.trantor.api.annotation.typemeta.Label;

/**
 * @author <a href="yzl249497@alibaba-inc.com">yangzhilin</a>
 * @description:企业经营状态
 * @date Create on 2020/4/14
 * @since version1.0 Copyright 2020 terminus.io All Rights Reserved.
 */
@TDict(name = "经营状态")
public class OperatingStatus {

    @Label("存续")
    public static final String SURVIVAL = "0";

    @Label("在业")
    public static final String EMPLOYMENT = "1";

    @Label("吊销")
    public static final String REVOKED = "2";

    @Label("注销")
    public static final String CANCELLATION = "3";

    @Label("迁入")
    public static final String MOVE_IN = "4";

    @Label("迁出")
    public static final String MOVE_OUT = "5";

    @Label("停业")
    public static final String CLOSED = "6";

    @Label("清算")
    public static final String CLEARING = "7";

}
