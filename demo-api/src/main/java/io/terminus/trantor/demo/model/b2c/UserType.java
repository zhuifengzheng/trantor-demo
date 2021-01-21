
package io.terminus.trantor.demo.model.b2c;

import io.terminus.trantor.api.annotation.TDict;
import io.terminus.trantor.api.annotation.typemeta.Label;

/**
 * @author youyu
 */
@TDict(name = "员工类别")
public class UserType {
    @Label("正式")
    public static final String NORMAL = "NORMAL";

    @Label("试用")
    public static final String TRIAL = "TRIAL";

    @Label("实习")
    public static final String PRACTICE = "PRACTICE";

    @Label("临时")
    public static final String TEMPORARY = "TEMPORARY";

    @Label("外包")
    public static final String FARM_OUT = "FARM_OUT";
}
