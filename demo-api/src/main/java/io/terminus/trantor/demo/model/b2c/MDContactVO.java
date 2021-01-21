package io.terminus.trantor.demo.model.b2c;

import io.terminus.trantor.api.annotation.BaseModel;
import io.terminus.trantor.api.annotation.TModel;
import io.terminus.trantor.api.annotation.TModelField;
import io.terminus.trantor.api.annotation.TModelFieldType;
import io.terminus.trantor.api.annotation.typemeta.TextMeta;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/**
 * @author liuyang
 * 2020-04-14 11:43
 */
@Data
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
@TModel(name = "联系人", isTransient = true)
public class MDContactVO extends BaseModel<Long> {
    private static final long serialVersionUID = 68045995505996796L;

    @TModelField(name = "姓名", nullable = false)
    @TextMeta(length = 30)
    private String name;

    @TModelField(name = "手机号码", nullable = false, type = TModelFieldType.Phone)
    @TextMeta(length = 12)
    private String mobile;

    @TModelField(name = "邮箱地址", type = TModelFieldType.Email)
    private String email;

    @TModelField(name = "固定电话")
    private String phone;

    @TModelField(name = "职位")
    @TextMeta(length = 30)
    private String position;

    @TModelField(name = "是否是默认联系人")
    private Boolean isDefault;
}

