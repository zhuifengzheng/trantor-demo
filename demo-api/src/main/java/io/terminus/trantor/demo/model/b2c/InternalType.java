
package io.terminus.trantor.demo.model.b2c;

import io.terminus.trantor.api.annotation.TDict;
import io.terminus.trantor.api.annotation.typemeta.Label;

@TDict(name = "公司类型")
public class InternalType {

    @Label(value = "母公司", dictItemGroup = {"all"})
    public static final String HAND_OFFICE = "HAND_OFFICE";

    @Label(value = "子公司",dictItemGroup = {"all","children"})
    public static final String SUBSIDIARY = "SUBSIDIARY";

    @Label(value = "分公司",dictItemGroup = {"all","children"})
    public static final String BRANCH_OFFICE = "BRANCH_OFFICE";

    @Label(value = "控股公司",dictItemGroup = {"all"})
    public static final String HOLDING_COMPANY = "HOLDING_COMPANY";

    @Label(value = "其他公司",dictItemGroup = {"children"})
    public static final String OTHER_COMPANY = "OTHER_COMPANY";
}
