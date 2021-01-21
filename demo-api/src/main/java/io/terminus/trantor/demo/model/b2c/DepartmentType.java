package io.terminus.trantor.demo.model.b2c;

import io.terminus.trantor.api.annotation.TDict;
import io.terminus.trantor.api.annotation.typemeta.Label;

/**
 * @author liuyang
 * 2020-08-19 11:38
 */
@TDict(name = "层级类型")
public class DepartmentType {
    
    @Label("虚拟")
    public static final String  VIRTUAL = "VIRTUAL";

    @Label("部门")
    public static final String  DEPARTMENT = "DEPARTMENT";

}