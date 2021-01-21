
package io.terminus.trantor.demo.manager.model;


import io.terminus.trantor.api.annotation.TDict;
import io.terminus.trantor.api.annotation.typemeta.Label;

/**
 * @author <a href="yzl249497@alibaba-inc.com">yangzhilin</a>
 * @description:
 * @date Create on 2020/4/10
 * @since version1.0 Copyright 2020 terminus.io All Rights Reserved.
 */
@TDict(name = "外部用户状态")
public class ExternerUserStatus {

    @Label("启用")
    public static final String ENABLE = "ENABLE";
    @Label("停用")
    public static final String DISABLE = "DISABLE";
}
