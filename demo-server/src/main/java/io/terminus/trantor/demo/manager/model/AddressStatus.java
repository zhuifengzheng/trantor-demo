package io.terminus.trantor.demo.manager.model;

import io.terminus.trantor.api.annotation.TDict;
import io.terminus.trantor.api.annotation.typemeta.Label;

/**
 * @author JiangKai
 * Date: 2020/11/26 11:34 上午
 * Description: 地址状态字典
 */
@TDict(name = "地址状态")
public class AddressStatus {
    @Label("启用")
    public static final String ENABLE = "ENABLE";

    @Label("停用")
    public static final String DISABLE = "DISABLE";
}
