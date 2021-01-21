package io.terminus.trantor.demo.model.b2c;

import io.terminus.trantor.api.annotation.TDict;
import io.terminus.trantor.api.annotation.typemeta.Label;

/**
 * @author liuyang
 * 2020-08-19 11:26
 */
@TDict(name = "部门状态")
public class DepartmentStatus {

    @Label("启用")
    public static final String ENABLE = "ENABLE";

    @Label("停用")
    public static final String DISABLE = "DISABLE";
}