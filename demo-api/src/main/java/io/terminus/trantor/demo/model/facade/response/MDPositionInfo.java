package io.terminus.trantor.demo.model.facade.response;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@ApiModel
@EqualsAndHashCode(callSuper = true)
public class MDPositionInfo extends MasterDataAbstractInfo {
    private static final long serialVersionUID = 3575669703188276913L;

    @ApiModelProperty(value = "编码")
    private Long id;

    @ApiModelProperty(value = "编码")
    private String code;

    @ApiModelProperty(value = "名称")
    private String name;

    @ApiModelProperty(value = "类型")
    private String type;

    @ApiModelProperty(value = "所属主体")
    private MDEnterpriseInfo enterprise;

    @ApiModelProperty(value = "公司编制")
    private MDEnterpriseInfo enterpriseOrg;



    @ApiModelProperty(value = "状态")
    private String status;

    @ApiModelProperty(value = "关联岗位")
    private MDPositionInfo positionRel;

    @ApiModelProperty(value = "所属部门")
    private MDDepartmentInfo department;

    @ApiModelProperty(value = "描述")
    private String desc;

    @ApiModelProperty(value = "业务类型(角色使用)")
    private String bizType;

}
