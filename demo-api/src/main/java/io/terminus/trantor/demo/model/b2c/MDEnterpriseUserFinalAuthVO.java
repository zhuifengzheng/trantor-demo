package io.terminus.trantor.demo.model.b2c;

import io.terminus.trantor.api.annotation.BaseModel;
import io.terminus.trantor.api.annotation.TModel;
import io.terminus.trantor.api.annotation.TModelField;
import io.terminus.trantor.api.annotation.typemeta.RelationMeta;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.util.List;

/**
 * @author youyu
 */
@Data
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
@TModel(name = "员工最终授权",  mainField = "roles" ,isTransient = true)
public class MDEnterpriseUserFinalAuthVO extends BaseModel<Long> {
    @TModelField(name = "授权对象")
    private String authObject;
    @TModelField(name = "授权角色")
    @RelationMeta(name = "MDRoleVO",modelClass = MDRoleVO.class)
    private List<MDRoleVO> roles;

    @TModelField(name = "员工id")
    private Long enterpriseUserId;
}
