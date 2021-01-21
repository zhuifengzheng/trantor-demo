package io.terminus.trantor.demo.model.b2c;

import io.terminus.trantor.api.annotation.BaseModel;
import io.terminus.trantor.api.annotation.TModel;
import io.terminus.trantor.api.annotation.TModelField;
import io.terminus.trantor.api.annotation.type.Address;
import io.terminus.trantor.api.annotation.typemeta.AddressMeta;
import io.terminus.trantor.api.annotation.typemeta.DictionaryMeta;
import io.terminus.trantor.api.annotation.typemeta.RelationMeta;
import io.terminus.trantor.module.base.model.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.util.Date;
import java.util.List;

/**
 * @author liuyang
 * 2020-04-15 10:35
 */
@Data
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
@TModel(name = "企业用户",  mainField = "name" ,isTransient = true)
public class MDEnterpriseUserVO extends BaseModel<Long> {
    private static final long serialVersionUID = 6736366592976974371L;

    @TModelField(name = "用户名")
    private String username;

    @TModelField(name = "用户昵称")
    private String nickname;

    @TModelField(name = "手机号")
    private String mobile;

    @TModelField(name = "关联用户")
    @RelationMeta(name = "user", modelClass = User.class)
    private User user;

    @TModelField(name = "关联企业")
    @RelationMeta(name = "enterprise", modelClass = MDEnterpriseVO.class)
    private MDEnterpriseVO enterprise;

    @TModelField(name = "是否管理员", defaultValue = "false")
    private Boolean admin;

    @TModelField(name = "工号")
    private String code;

    @TModelField(name = "邮箱")
    private String email;

    @TModelField(name = "所属行政组织")
    @RelationMeta(name = "MDDepartmentVO",modelClass = MDDepartmentVO.class)
    private MDDepartmentVO department;

    @TModelField(name = "所属岗位")
    @RelationMeta(name = "MDPositionVO",modelClass = MDPositionVO.class)
    private MDPositionVO position;

    @TModelField(name = "兼职岗位")
    @RelationMeta(name = "MDPositionVOs",modelClass = MDPositionVO.class)
    private List<MDPositionVO> partTimePosition;

    @TModelField(name = "入职时间")
    private Date entryTime;

    @TModelField(name = "离职时间")
    private Date resignationTime;

    @TModelField(name = "状态")
    @DictionaryMeta(clazz = UserStatus.class)
    private String status;

    @TModelField(name = "描述")
    private String desc;

    @TModelField(name = "姓名")
    private String name;

    @TModelField(name = "工作地区")
    @AddressMeta(containsPostcode = false,containsDetail=false)
    private Address address;

    @TModelField(name = "工作地点")
    private String workingPlace;

    @TModelField(name = "类型",dbColumnName = "type")
    @DictionaryMeta(clazz = UserType.class)
    private String type;

    @TModelField(name = "公司编制")
    @RelationMeta(name = "MDEnterpriseVO",modelClass = MDEnterpriseVO.class)
    private MDEnterpriseVO enterpriseOrg;

    /**
     * 复用岗位授权的授权方式
     */
    @TModelField(name = "授权方式")
    @DictionaryMeta(clazz = PositionAuthType.class)
    private String authType;

    @TModelField(name = "员工最终授权")
    @RelationMeta(name = "MDEnterpriseUserFinalAuthVO",modelClass = MDEnterpriseUserFinalAuthVO.class)
    private List<MDEnterpriseUserFinalAuthVO> finalAuthVOS;

    @TModelField(name = "员工授权")
    @RelationMeta(name = "MDRoleVO",modelClass = MDRoleVO.class)
    private List<MDRoleVO> enterpriseUserRoleVOS;

    @TModelField(name = "员工分派实体")
    @RelationMeta(name = "MDBusinessEntityVO",modelClass = MDBusinessEntityVO.class)
    private List<MDBusinessEntityVO> businessEntityVOS;
}

