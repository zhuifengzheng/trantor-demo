package io.terminus.trantor.demo.manager.model;

import io.terminus.trantor.api.annotation.TDict;
import io.terminus.trantor.api.annotation.typemeta.Label;

/**
 * @author liuyang
 * 2020-10-23 15:24
 */
@TDict(name = "主体类型")
public class EntityCompanyType {

    @Label("公司")
    public static final String ENTERPRISE = "ENTERPRISE";

    @Label("个人")
    public static  final String PERSONAL = "PERSONAL";
}