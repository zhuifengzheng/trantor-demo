package io.terminus.trantor.demo.manager.model;

import io.terminus.trantor.api.annotation.TDict;
import io.terminus.trantor.api.annotation.typemeta.Label;

/**
 * @author liuyang
 * 2020-08-19 16:20
 */
@TDict(name = "业务身份")
public class BusinessIdentityType {

    @Label("主企业")
    public static final String MAIN_ENTERPRISE="main_enterprise";

    @Label("供应商")
    public static final String SUPPLIER="supplier";

    @Label("承运商")
    public static final String CARRIER="carrier";

    @Label("客户")
    public static final String CUSTOMER="customer";

}
