package io.terminus.trantor.demo.model.b2c;

import io.terminus.trantor.api.annotation.BaseModel;
import io.terminus.trantor.api.annotation.TModel;
import io.terminus.trantor.api.annotation.TModelField;
import io.terminus.trantor.api.annotation.typemeta.DictionaryMeta;
import io.terminus.trantor.api.annotation.typemeta.RelationMeta;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.util.List;

@Data
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
@TModel(name = "部门", mainField = "name",isTransient = true)
public class MDDepartmentVO extends BaseModel<Long> {
    private static final long serialVersionUID = -5811343333907831374L;

    @TModelField(name = "编码")
    private String code;

    @TModelField(name = "负责人")
    @RelationMeta(name = "MDEnterpriseUserVO",modelClass = MDEnterpriseUserVO.class)
    private MDEnterpriseUserVO charge;

    @TModelField(name = "层级")
    private Integer level;

    @TModelField(name = "是否末级")
    private Boolean isLeaf;

    @TModelField(name = "是否有孩子节点")
    private Boolean hasChildren;

    @TModelField(name = "所属主体")
    @RelationMeta(name = "MDEnterpriseVO",modelClass = MDEnterpriseVO.class)
    private MDEnterpriseVO enterprise;

    @TModelField(name = "层级类型")
    @DictionaryMeta(clazz = DepartmentType.class)
    private String type;

    @TModelField(name = "上级部门")
    @RelationMeta(name = "MDDepartmentVO",modelClass = MDDepartmentVO.class)
    private MDDepartmentVO parent;

    @TModelField(name = "名称")
    private String name;

    @TModelField(name = "描述")
    private String desc;

    @TModelField(name = "部门状态")
    @DictionaryMeta(clazz = DepartmentStatus.class)
    private String status;

    @TModelField(name = "孩子节点")
    @RelationMeta(name = "children",modelClass = MDDepartmentVO.class)
    private List<MDDepartmentVO> children;
}
