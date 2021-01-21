package io.terminus.trantor.demo.model.b2c;

import io.terminus.trantor.api.annotation.TDict;
import io.terminus.trantor.api.annotation.typemeta.Label;

/**
 * @author <a href="yzl249497@alibaba-inc.com">yangzhilin</a>
 * @description:
 * @date Create on 2020/4/14
 * @since version1.0 Copyright 2020 terminus.io All Rights Reserved.
 */
@TDict(name = "公司类型")
public class CapitalType {

    @Label("有限责任公司")
    public static final String LIMITED_LIABILITY = "0";

    @Label("股份有限责任公司")
    public static final String LIMITED_SHARES = "1";

    @Label("个人独资企业")
    public static final String SOLE_PROPRIETORSHIP = "2";

    @Label("合伙企业")
    public static final String PARTNERSHIP = "3";

}
