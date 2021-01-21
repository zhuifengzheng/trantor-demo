package io.terminus.trantor.demo.model.b2c;

import io.terminus.trantor.api.annotation.TDict;
import io.terminus.trantor.api.annotation.typemeta.Label;

@TDict(name = "内公司状态")
public class InternalStatus {
    @Label("启用")
    public static final String ENABLE="ENABLE";

    @Label("停用")
    public static final String DISABLE="DISABLE";

    @Label("草稿")
    public static final String INITIAL="INITIAL";
}
