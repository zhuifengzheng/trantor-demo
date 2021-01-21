package io.terminus.trantor.demo.model.facade.response;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

/**
 * @Desc
 * @Author: huangdanfeng
 * @CreateTime: 2020/9/4
 */
@Data
@ApiModel
@EqualsAndHashCode(callSuper = true)
public class MDOrganizationInfo extends MasterDataAbstractInfo {

    @ApiModelProperty(value = "企业主体Id")
    private Long mdEnterpriseId;

    @ApiModelProperty(value = "企业主体Code")
    private String mdEnterpriseCode;

    @ApiModelProperty(value = "企业主体名称")
    private String mdEnterpriseName;

    @ApiModelProperty(value = "企业员工Code")
    private String enterpriseUserCode;

    @ApiModelProperty(value = "企业员工Name")
    private String enterpriseUserName;

    @ApiModelProperty(value = "部门Code")
    private String departmentCode;

    @ApiModelProperty(value = "部门名称")
    private String departmentName;

    @ApiModelProperty(value = "业务组织Id")
    private List<Long> mdBusinessOrganizationIdList;

    @ApiModelProperty(value = "业务组织Code")
    private List<String> mdBusinessOrganizationCodeList;

    //partner 上下文
    @ApiModelProperty(value = "用户Id")
    private Long userId;
    @ApiModelProperty(value = "当前用户所属公司Id")
    private Long enterpriseId;
    @ApiModelProperty(value = "当前用户所属公司及下级公司")
    private List<Long> enterpriseIdList;
    @ApiModelProperty(value = "当前用户所属主部门id")
    private Long departmentId;
    @ApiModelProperty(value = "当前员工id")
    private Long enterpriseUserId;
    @ApiModelProperty(value = "当前员工所属主岗位id")
    private Long positionId;
    @ApiModelProperty(value = "当前员工所属采购组织的完整实体树")
    private List<Long> subOrgIdList;
    @ApiModelProperty(value = "当前员工所属采购组织的完整实体树，同级隔离")
    private List<Long> partOrgIdList;
    @ApiModelProperty(value = "当前员工所属采购组织上级采购组织、包括自身")
    private List<Long> parentOrgIdList;
    @ApiModelProperty(value = "当前员工所属采购组织下级采购组织、包括自身")
    private List<Long> childOrgIdList;
    @ApiModelProperty(value = "当前员工所属业务实体的完整实体树")
    private List<Long> subEntityIdList;
    @ApiModelProperty(value = "当前员工所属业务实体上级业务实体、同级隔离")
    private List<Long> partEntityIdList;
    @ApiModelProperty(value = "当前员工所属业务实体上级业务实体、同级隔离")
    private List<Long> parentEntityIdList;
    @ApiModelProperty(value = "当前员工所属业务实体下级业务实体、包括自身")
    private List<Long> childEntityIdList;

}
