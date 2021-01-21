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
@TModel(name = "岗位", mainField = "name", isTransient = true)
public class MDPositionVO extends BaseModel<Long> {
    private static final long serialVersionUID = -5811343333907831374L;

    @TModelField(name = "编码")
    private String code;

    @TModelField(name = "名称")
    private String name;

    @TModelField(name = "类型")
    private String type;

    @TModelField(name = "所属主体")
    @RelationMeta(name = "MDEnterpriseVO",modelClass = MDEnterpriseVO.class)
    private MDEnterpriseVO enterprise;


    @TModelField(name = "公司编制")
    @RelationMeta(name = "MDEnterpriseVO",modelClass = MDEnterpriseVO.class)
    private MDEnterpriseVO enterpriseOrg;


    @TModelField(name = "替换岗位")
    @RelationMeta(name = "MDPositionVO",modelClass = MDPositionVO.class)
    private MDPositionVO positionChange;


    @TModelField(name = "岗位授权")
    @RelationMeta(name = "MDPositionRoleVo",modelClass = MDPositionRoleVO.class)
    private List<MDPositionRoleVO> positionRoleVo;

    @TModelField(name = "授权方式")
    @DictionaryMeta(clazz = PositionAuthType.class)
    private String positionAuthType;

    @TModelField(name = "状态")
    @DictionaryMeta(clazz = PositionStatus.class)
    private String status;

    @TModelField(name = "部门")
    @RelationMeta(name = "MDDepartmentVO",modelClass = MDDepartmentVO.class)
    private MDDepartmentVO department;

    @TModelField(name = "关联职位")
    @RelationMeta(name = "MDPositionVO",modelClass = MDPositionVO.class)
    private MDPositionVO positionRel;

    @TModelField(name = "描述")
    private String desc;

}
