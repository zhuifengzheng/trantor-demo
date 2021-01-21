package io.terminus.trantor.demo.model.b2c;

import io.terminus.trantor.api.annotation.BaseModel;
import io.terminus.trantor.api.annotation.FieldGroup;
import io.terminus.trantor.api.annotation.TModel;
import io.terminus.trantor.api.annotation.TModelField;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/**
 * @author youyu
 */
@Data
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
@TModel(name = "员工角色", mainField = "name", isTransient = true,fieldGroups = {@FieldGroup(fieldName = {"id","key", "name", "desc", "projectId", "projectName"})})
public class MDRoleVO extends BaseModel<Long> {
    @TModelField(name = "角色名称")
    private String name;

    @TModelField(name = "备注说明")
    private String desc;

    @TModelField(name = "角色标识")
    private String key;

    @TModelField(name = "业务对象唯一标识")
    private String affiliationId;

    @TModelField(name = "角色类型")
    private String affiliationType;

    @TModelField(name = "项目id")
    private Long projectId;


    @TModelField(name = "应用id")
    private Long appId;

    @TModelField(name = "应用名称")
    private String appName;

    @TModelField(name = "项目名称")
    private String projectName;
}
