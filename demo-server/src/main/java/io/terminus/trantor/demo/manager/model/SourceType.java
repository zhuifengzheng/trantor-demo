package io.terminus.trantor.demo.manager.model;

import io.terminus.trantor.api.annotation.TDict;
import io.terminus.trantor.api.annotation.typemeta.Label;

/**
 * @author liuyang
 * 2020-08-19 15:17
 */
@TDict(name = "来源类型")
public class SourceType {

    @Label("内部")
    public static final String INTERNAL = "INTERNAL";

    @Label("外部")
    public static final String EXTERNAL = "EXTERNAL";

}
