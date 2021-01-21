package io.terminus.trantor.demo.model.b2c;

import io.terminus.trantor.api.annotation.TDict;
import io.terminus.trantor.api.annotation.typemeta.Icon;
import io.terminus.trantor.api.annotation.typemeta.Label;

/**
 * @author liuyang
 * 2020-08-19 11:26
 */
@TDict(name = "岗位状态")
public class PositionStatus {

    @Label(value = "启用",icon = Icon.dot, iconColor = Icon.Color.Green)
    public static final String ENABLE = "ENABLE";

    @Label(value = "停用",icon = Icon.dot, iconColor = Icon.Color.Red)
    public static final String DISABLE = "DISABLE";

    @Label(value = "草稿",icon = Icon.dot, iconColor = Icon.Color.Black)
    public static final String INITIAL = "INITIAL";
}