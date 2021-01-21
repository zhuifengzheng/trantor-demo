/*
 * Copyright (c) 2020. 杭州端点网络科技有限公司.  All rights reserved.
 */

package io.terminus.trantor.demo.model.facade.response;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.terminus.trantor.api.annotation.type.Address;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Date;
import java.util.List;

/**
 * @author lsk mailto:liushaokang@terminus.io
 * @create 2020-06-30 11:17 上午
 **/
@Data
@ApiModel
@EqualsAndHashCode(callSuper = true)
public class MDEnterpriseUserInfo extends MasterDataAbstractInfo {
    private static final long serialVersionUID = -8010980087685286509L;

    @ApiModelProperty("企业用户id")
    private Long id;

    @ApiModelProperty("关联用户id")
    private Long userId;

    @ApiModelProperty("关联用户名")
    private String username;

    @ApiModelProperty("关联用昵称")
    private String nickname;

    @ApiModelProperty("关联用户手机号")
    private String mobile;

    @ApiModelProperty("是否管理员")
    private Boolean admin;

    @ApiModelProperty("工号")
    private String code;

    @ApiModelProperty("关联企业")
    private MDEnterpriseInfo enterpriseInfo;

    @ApiModelProperty("邮箱")
    private String email;

    @ApiModelProperty("所属部门")
    private MDDepartmentInfo department;

    @ApiModelProperty("所属岗位")
    private MDPositionInfo position;

    @ApiModelProperty("兼职岗位")
    private List<MDPositionInfo> partTimePosition;

    @ApiModelProperty("入职时间")
    private Date entryTime;

    @ApiModelProperty("描述")
    private String desc;

    @ApiModelProperty("状态")
    private String status;

    @ApiModelProperty("启用")
    private Boolean enable;

    @ApiModelProperty("姓名")
    private String name;

    @ApiModelProperty("地址对象")
    private Address address;

    @ApiModelProperty("工作地点")
    private String workplace;

    @ApiModelProperty("公司编制")
    private MDEnterpriseInfo enterpriseOrg;

    @ApiModelProperty("员工类型")
    private String type;

    public MDEnterpriseInfo getEnterprise(){
        return enterpriseInfo;
    }

    public void setEnterprise(MDEnterpriseInfo enterpriseInfo){
        this.enterpriseInfo = enterpriseInfo;
    }

}
