package io.terminus.trantor.demo.manager.model;

import io.terminus.trantor.api.annotation.TDict;
import io.terminus.trantor.api.annotation.typemeta.Label;

/**
 * @author <a href="yzl249497@alibaba-inc.com">yangzhilin</a>
 * @description: 性别
 * @date Create on 2020/4/10
 * @since version1.0 Copyright 2020 terminus.io All Rights Reserved.
 */
@TDict(name = "性别")
public class Gender {

    @Label(value = "男性")
    public static final String MALE = "MALE";

    @Label(value = "女性")
    public static final String FEMALE = "FEMALE";

    @Label(value = "其它")
    public static final String OTHERS = "OTHERS";
}
