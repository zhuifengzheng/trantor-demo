package io.terminus.trantor.demo.model.b2c;

import io.terminus.trantor.api.annotation.TDict;
import io.terminus.trantor.api.annotation.typemeta.Label;

@TDict(name = "国家代码")
public class CountryStatusDict {
    // 国家/地区编号（sg：新加坡，my：马来西亚，ph：菲律宾，th：泰国，id：印度尼西亚，vn：越南）
    @Label("菲律宾")
    public static final String FVB = "ph";

    @Label("越南")
    public static final String YN = "vn";

    @Label("新加坡")
    public static final String XJP = "sg";

    @Label("马来西亚")
    public static final String MLXY = "my";

    @Label("印度尼西亚")
    public static final String YDNXY = "id";

    @Label("泰国")
    public static final String TG = "th";

    @Label("跨境卖方")
    public static final String KJMF = "cb";


}
