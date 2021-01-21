/*
 * Copyright (c) 2020. 杭州端点网络科技有限公司.  All rights reserved.
 */

package io.terminus.trantor.demo.model.facade.enums;

import io.terminus.api.consts.OperationType;
import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author lsk mailto:liushaokang@terminus.io
 * @create 2020-06-30 10:04 上午
 **/
@Getter
@AllArgsConstructor
public enum EnterpriseUserOperationType implements OperationType {
    CREATE_ENTERPRISE_USER("企业用户创建", true),
    DELETE_ENTERPRISE_USER("删除企业用户", true),
    ENTERPRISE_USER_FIND_BY_ID("通过ID查询企业用户信息", false),
    ENTERPRISE_USER_FIND_BY_ENTERPRISE_IDS("通过企业ID集合查询企业用户信息", false),
    ENTERPRISE_USER_FIND_BY_USER_ID("通过用户ID查询所属企业", false),
    ENTERPRISE_USER_PAGE_QUERY("分页查询企业用户信息", false),
    TRANSPORTER_PAGE_QUERY("分页查询承运商用户信息", false);


    private final String description;
    private final boolean write;
}
