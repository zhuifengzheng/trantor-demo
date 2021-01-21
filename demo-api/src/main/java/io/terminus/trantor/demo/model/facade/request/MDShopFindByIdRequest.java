/*
 * Copyright (c) 2020. 杭州端点网络科技有限公司.  All rights reserved.
 */

package io.terminus.trantor.demo.model.facade.request;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.terminus.api.consts.OperationType;
import io.terminus.api.utils.ParamUtil;
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
public class MDShopFindByIdRequest extends MasterDataAbstractRequest {
    private static final long serialVersionUID = 5625679238516108278L;

    @ApiModelProperty(value = "店铺ID", required = true)
    private Long id;

    @Override
    public OperationType getOperationType() {
        return ShopOperationType.SHOP_FIND_BY_ID;
    }

    @Override
    public void checkParam() {
        super.checkParam();

        ParamUtil.nonNull(id, "MDShopFindByIdRequest.idCannotBeNull");
    }
}
