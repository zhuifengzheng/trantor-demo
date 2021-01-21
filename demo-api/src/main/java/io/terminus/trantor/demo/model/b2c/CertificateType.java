package io.terminus.trantor.demo.model.b2c;


import io.terminus.trantor.api.annotation.TDict;
import io.terminus.trantor.api.annotation.typemeta.Label;

/**
 * @author <a href="yzl249497@alibaba-inc.com">yangzhilin</a>
 * @description:
 * @date Create on 2020/4/14
 * @since version1.0 Copyright 2020 terminus.io All Rights Reserved.
 */

@TDict(name = "证件类型")
public class CertificateType {

    @Label("中国居民身份证")
    public static final String CHINESE = "CHINESE";

    @Label("港澳台身份证")
    public static final String HONG_KONG_MACAO_TAIWAN = "HONG_KONG_MACAO_TAIWAN";

    @Label("华侨身份证")
    public static final String OVERSEAS_CHINESE = "OVERSEAS_CHINESE";

    @Label("护照")
    public static final String PASSPORT = "PASSPORT";

    @Label(value = "个人类型")
    public static final String PERSON = "PERSON";

}
