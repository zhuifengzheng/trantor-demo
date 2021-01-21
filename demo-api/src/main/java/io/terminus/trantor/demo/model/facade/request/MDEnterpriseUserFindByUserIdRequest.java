/*
 * Copyright (c) 2020. 杭州端点网络科技有限公司.  All rights reserved.
 */

package io.terminus.trantor.demo.model.facade.request;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.terminus.api.consts.OperationType;
import io.terminus.api.utils.ParamUtil;
import io.terminus.trantor.demo.model.facade.enums.EnterpriseUserOperationType;
import lombok.*;

/**
 * @author lsk mailto:liushaokang@terminus.io
 * @create 2020-06-30 10:07 上午
 **/
@Data
@ApiModel
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class MDEnterpriseUserFindByUserIdRequest extends MasterDataAbstractRequest {
    private static final long serialVersionUID = -3365369822204471729L;

    @ApiModelProperty("关联用户id")
    private Long userId;

    @Override
    public OperationType getOperationType() {
        return EnterpriseUserOperationType.ENTERPRISE_USER_FIND_BY_ID;
    }

    @Override
    public void checkParam() {
        super.checkParam();

        ParamUtil.nonNull(userId, "MDEnterpriseUserFindByUserIdRequest.userIdCannotBeNull");
    }
}
