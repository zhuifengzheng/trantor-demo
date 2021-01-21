package io.terminus.trantor.demo.model.b2c;

import io.terminus.trantor.api.annotation.TDict;
import io.terminus.trantor.api.annotation.TModel;
import io.terminus.trantor.api.annotation.TModelField;
import io.terminus.trantor.api.annotation.typemeta.DictionaryMeta;
import io.terminus.trantor.api.annotation.typemeta.Label;
import io.terminus.trantor.custom.api.annotation.ExtendTModel;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @Author by yuanpeng
 * @Date 2021/1/19
 */
@EqualsAndHashCode(callSuper = true)
@Data
//@ExtendTModel(MDShopVO.class)
@TModel(name = "B2c店铺", isTransient = true)
public class B2cMDShopVO extends MDShopVO{

    private static final long serialVersionUID = -3144459219269588136L;
    @TModelField(name = "是否授权")
//    @DictionaryMeta(clazz = GrantAuthorizationStatusDict.class)
    private Integer grantAuthorization;

    @TModelField(name = "授权码")
    private String grantCode;

    @TModelField(name = "国家")
    @DictionaryMeta(clazz = CountryStatusDict.class)
    private String countryCode;
    // todo MDShopVo里面存在了 appKey
//    @TModelField(name = "appKey")
//    private String appKey;// = "111111";
//
//    @TModelField(name = "appSecret")
//    private String appSecret;// = "xxxxxx";

}

