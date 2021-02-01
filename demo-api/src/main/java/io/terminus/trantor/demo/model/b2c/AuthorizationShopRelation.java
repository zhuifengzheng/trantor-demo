package io.terminus.trantor.demo.model.b2c;

import io.terminus.trantor.api.annotation.BaseModel;
import io.terminus.trantor.api.annotation.TModel;
import io.terminus.trantor.api.annotation.TModelField;
import io.terminus.trantor.api.annotation.TModelFieldType;
import lombok.Data;

/**
 * @Author by yuanpeng
 * @Date 2021/1/27
 */
@TModel(
        name = "店铺授权关系表",
        dbTableName = "authorization_shop_relation"
)
@Data
public class AuthorizationShopRelation extends BaseModel<Long> {

    private static final long serialVersionUID = -5604087869081121390L;
    @TModelField(name = "店铺id", dbColumnName = "shop_id")
    private Long shopId;

    @TModelField(name = "是否授权", dbColumnName = "is_grant_authorization")
    private Boolean grantAuthorization;

    @TModelField(name = "额外信息", dbColumnName = "extra_json", type = TModelFieldType.Text)
    private String extraJson;

    @TModelField(name = "授权token", dbColumnName = "token")
    private String token;

    @TModelField(name = "刷新token", dbColumnName = "refresh_token")
    private String refreshToken;

    @TModelField(name = "国家编号，一个卖家可以对应多个站点，就存在多个国家，用逗号分割开，用于匹配站点",dbColumnName = "country")
    private String country;

    @TModelField(name = "渠道code，目前支持lazada", dbColumnName = "channel_code")
    private String channelCode;

    @TModelField(name = "授权信息", dbColumnName = "token_info_json", type = TModelFieldType.Text)
    private String tokenInfoJson;


}
