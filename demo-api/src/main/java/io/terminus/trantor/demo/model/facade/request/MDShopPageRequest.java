/*
 * Copyright (c) 2020. 杭州端点网络科技有限公司.  All rights reserved.
 */

package io.terminus.trantor.demo.model.facade.request;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.terminus.api.consts.OperationType;
import io.terminus.api.request.AbstractPageRequest;
import io.terminus.trantor.demo.model.facade.enums.ShopOperationType;
import lombok.*;

/**
 * @author lsk mailto:liushaokang@terminus.io
 * @create 2020-06-16 2:44 下午
 **/
@Data
@ApiModel
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class MDShopPageRequest extends AbstractPageRequest {
    private static final long serialVersionUID = 5625679238516108278L;

    @ApiModelProperty("店铺ID")
    private Long id;

    @ApiModelProperty(value = "店铺名称")
    private String name;

    @ApiModelProperty(value = "店铺编码")
    private String code;

    @ApiModelProperty(value = "所属企业ID")
    private Long relegationEnterpriseId;

    @ApiModelProperty(value = "经营企业ID")
    private Long manageEnterpriseId;

    @ApiModelProperty(value = "店铺类型")
    private String shopType;

    @ApiModelProperty(value = "关联渠道ID")
    private Long channelId;

    @Override
    public OperationType getOperationType() {
        return ShopOperationType.PAGE_QUERY_SHOP;
    }

    @Override
    public void checkParam() {
        super.checkParam();
    }
}
