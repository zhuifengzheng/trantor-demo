package io.terminus.trantor.demo.model.facade.response;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

@Data
@ApiModel
@EqualsAndHashCode(callSuper = true)
public class MDDepartmentInfo extends MasterDataAbstractInfo {
    private static final long serialVersionUID = 3575669703188276913L;
    @ApiModelProperty(value = "id")
    private Long id;

    @ApiModelProperty(value = "编码")
    private String code;

    @ApiModelProperty(value = "负责人")
    private MDEnterpriseUserInfo charge;

    @ApiModelProperty(value = "层级")
    private Integer level;

    @ApiModelProperty(value = "是否末级")
    private Boolean isLeaf;

    @ApiModelProperty(value = "所属主体")
    private MDEnterpriseInfo enterprise;

    @ApiModelProperty(value = "层级类型")
    private String type;

    @ApiModelProperty(value = "上级部门")
    private MDDepartmentInfo parent;

    @ApiModelProperty(value = "名称")
    private String name;

    @ApiModelProperty(value = "描述")
    private String desc;

    @ApiModelProperty(value = "部门状态")
    private String status;

    @ApiModelProperty(value = "孩子节点")
    private List<MDDepartmentInfo> children;

}
