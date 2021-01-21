package io.terminus.trantor.demo.model.b2c;

import io.terminus.trantor.api.annotation.TDict;
import io.terminus.trantor.api.annotation.typemeta.Label;

/**
 * @author liuyang
 * 2020-04-13 13:29
 */
@TDict(name = "仓库类型")
public class WarehouseType {

    @Label("中心")
    public static final String CENTER = "CENTER";

    @Label("城市")
    public static final String CITY = "CITY";

    @Label("前置")
    public static final String PRE = "PRE";

    @Label("转运")
    public static final String TRANSFER = "TRANSFER";

    @Label("店仓")
    public static final String SHOP = "SHOP";
}