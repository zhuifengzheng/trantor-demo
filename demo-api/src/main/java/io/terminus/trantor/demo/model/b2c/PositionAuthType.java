package io.terminus.trantor.demo.model.b2c;

import io.terminus.trantor.api.annotation.TDict;
import io.terminus.trantor.api.annotation.typemeta.Label;

/**
 * @author <a href="mailto:zhaoxiaotao@terminus.io">tony</a>
 * io.terminus.master.data.admin.action.vo.enterprise.dictionary
 * 2020/10/29 12:28
 * master-data
 */
@TDict(name = "授权方式")
public class PositionAuthType {

    @Label("替换角色")
    public static final String REPLACE = "REPLACE";

    @Label("补充角色")
    public static final String SUPPLY = "SUPPLY";
}
