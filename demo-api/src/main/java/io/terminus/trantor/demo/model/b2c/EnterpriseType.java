package io.terminus.trantor.demo.model.b2c;

import io.terminus.trantor.api.annotation.TDict;
import io.terminus.trantor.api.annotation.TDictType;
import io.terminus.trantor.api.annotation.typemeta.Label;

/**
 * @author <a href="yzl249497@alibaba-inc.com">yangzhilin</a>
 * @description: 企业类型
 * @date Create on 2020/4/14
 * @since version1.0 Copyright 2020 terminus.io All Rights Reserved.
 */
@TDict(name = "企业类型",type = TDictType.String)
public class EnterpriseType {

    @Label("企业")
    public static final String E = "E";

    @Label("事业单位")
    public static final String I = "I";

    @Label("政府机关")
    public static final String G = "G";

    @Label("个体工商户")
    public static final String S = "S";

    @Label("合作社")
    public static final String C = "C";

    @Label("境外企业")
    public static final String A = "A";

    @Label("个人")
    public static final String P = "P";

    @Label("社会团体")
    public static final String O = "O";

}
