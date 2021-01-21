package io.terminus.trantor.demo.model.b2c;

import io.terminus.trantor.api.annotation.TDict;
import io.terminus.trantor.api.annotation.TDictType;
import io.terminus.trantor.api.annotation.typemeta.Label;

/**
 * @author liuyang
 * 2020-09-07 17:05
 */
@TDict(name = "产业类型",type = TDictType.String)
public class IndustryType {

    @Label("制造")
    public static final String MANUFACTURING = "MANUFACTURING";

    @Label("地产")
    public static final String REAL_ESTATE = "REAL_ESTATE";

    @Label("金融")
    public static final String FINANCE = "FINANCE";
}
