package io.terminus.trantor.demo.model.b2c;

import io.terminus.trantor.api.annotation.TDict;
import io.terminus.trantor.api.annotation.typemeta.Label;

/**
 * @class: master-data
 * @description: 业务实体所处阶段字典
 * @author: cyj
 * @create: 2020-10-22 21:40
 **/
@TDict(name = "阶段字典")
public class BussinessEntityStageDict {

    @Label("准备")
    public static final String PREPARE = "PREPARE";

    @Label("开发")
    public static final String DEVELOP = "DEVELOP";

    @Label("运营")
    public static final String OPERATION = "OPERATION";

}
