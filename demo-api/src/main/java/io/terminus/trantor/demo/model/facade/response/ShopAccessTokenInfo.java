package io.terminus.trantor.demo.model.facade.response;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @Author by yuanpeng
 * @Date 2021/1/25
 */
@Data
@ApiModel
@EqualsAndHashCode(callSuper = true)
public class ShopAccessTokenInfo extends MasterDataAbstractInfo {
    private static final long serialVersionUID = 8013452481956307995L;
    @ApiModelProperty(value = "访问令牌")
    private String access_token;

    @ApiModelProperty(value = "刷新令牌，当“refreshExpiresIn”> 0时用于刷新令牌")
    private String refresh_token;

    @ApiModelProperty(value = "国家/地区编号（sg：新加坡，my：马来西亚，ph：菲律宾，th：泰国，id：印度尼西亚，vn：越南")
    private String country;

    @ApiModelProperty(value = "刷新令牌的到期时间")
    private Long refresh_expires_in;

    @ApiModelProperty(value = "用户平台，支持多个平台")
    private String account_platform;

    @ApiModelProperty(value = "访问令牌的到期时间,默认30天")
    private Long expires_in;

    @ApiModelProperty(value = "用户帐号")
    private String account;

    private java.util.List<CountryUserInfo> country_user_info;

    @ApiModelProperty(value = "请求id")
    private String request_id;

    @ApiModelProperty(value = "返回消息，一般用于请求错误时")
    private String message;

    @ApiModelProperty(value = "错误code")
    private String code;

    @ApiModelProperty(value = "错误类型")
    private String type;

}

@Data
class CountryUserInfo extends MasterDataAbstractInfo {

    private static final long serialVersionUID = -6733405573091455699L;
    @ApiModelProperty(value = "用户id")
    private String user_id;

    @ApiModelProperty(value = "商家id")
    private String seller_id;

    @ApiModelProperty(value = "国家编号")
    private String country;

    private String short_code;
}