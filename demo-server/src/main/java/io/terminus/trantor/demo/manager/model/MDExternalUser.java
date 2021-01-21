package io.terminus.trantor.demo.manager.model;

import io.terminus.trantor.api.annotation.BaseModel;
import io.terminus.trantor.api.annotation.TModel;
import io.terminus.trantor.api.annotation.TModelField;
import io.terminus.trantor.api.annotation.TModelFieldType;
import io.terminus.trantor.api.annotation.typemeta.DictionaryMeta;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;
import java.time.LocalDate;

/**
 * @author <a href="yzl249497@alibaba-inc.com">yangzhilin</a>
 * @description:
 * @date Create on 2020/4/10
 * @since version1.0 Copyright 2020 terminus.io All Rights Reserved.
 */
@Data
@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
@TModel(name = "外部用户", dbTableName = "md_external_user")
public class MDExternalUser extends BaseModel<Long> {
    private static final long serialVersionUID = -9164367222583598509L;

    @TModelField(name = "账号信息", dbColumnName = "user_id")
    private Long userId;

    /**
     * 真实姓名
     */
    @TModelField(name = "真实姓名", dbColumnName = "real_name")
    private String realName;
    /**
     * 性别
     */
    @TModelField(name = "性别", nullable = false, dbColumnName = "gender")
    @NotNull(message = "性别不能为空")
    @DictionaryMeta(clazz = Gender.class)
    private String gender;
    /**
     * 身份证
     */
    @TModelField(name = "身份证号", dbColumnName = "id_card")
    private String idCard;
    /**
     * 出生日期
     */
    @TModelField(name = "出生日期", type = TModelFieldType.Date, dbColumnName = "birthday")
    private LocalDate birthday;

    /**
     * 用户状态
     */
    @TModelField(name = "用户状态", dbColumnName = "external_user_status")
    @DictionaryMeta(clazz = ExternerUserStatus.class)
    private String externalUserStatus;

}
