package io.terminus.trantor.demo.model.b2c;

import io.terminus.trantor.api.annotation.TDict;
import io.terminus.trantor.api.annotation.TModel;
import io.terminus.trantor.api.annotation.TModelField;
import io.terminus.trantor.api.annotation.typemeta.DictionaryMeta;
import io.terminus.trantor.api.annotation.typemeta.Label;
import io.terminus.trantor.custom.api.annotation.ExtendTModel;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.validation.constraints.NotNull;

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
//    @TModelField(name = "店铺id")
//    private Long shopId;

    @TModelField(name = "是否授权")
//    @DictionaryMeta(clazz = GrantAuthorizationStatusDict.class)
    private Boolean grantAuthorization;

    @TModelField(name = "当前进度")
    private Integer grantProgress;

    @TModelField(name = "授权码",nullable = false)
    @NotNull(message = "授权码不能为空")
    private String grantCode;

    @TModelField(name = "国家")
    @DictionaryMeta(clazz = CountryStatusDict.class)
    @NotNull(message = "国家不能为空")
    private String countryCode;
    // todo MDShopVo里面存在了 appKey
//    @TModelField(name = "appKey")
//    private String appKey;// = "111111";
//
//    @TModelField(name = "appSecret")
//    private String appSecret;// = "xxxxxx";

    @TModelField(name = "商品同步")
    private boolean itemSynchronized;

    @TModelField(name = "订单同步")
    private boolean orderSynchronized;

}

