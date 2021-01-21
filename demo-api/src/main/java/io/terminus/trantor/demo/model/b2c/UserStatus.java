package io.terminus.trantor.demo.model.b2c;

import io.terminus.trantor.api.annotation.TDict;
import io.terminus.trantor.api.annotation.typemeta.Icon;
import io.terminus.trantor.api.annotation.typemeta.Label;

/**
 * @author liuyang
 * 2020-08-19 14:07
 */
@TDict(name = "员工状态")
public class UserStatus {

    @Label(value = "启用",icon = Icon.dot, iconColor = Icon.Color.Green)
    public static final String ENABLE="ENABLE";

    @Label(value = "停用",icon = Icon.dot, iconColor = Icon.Color.Red)
    public  static final String DISABLE="DISABLE";

}