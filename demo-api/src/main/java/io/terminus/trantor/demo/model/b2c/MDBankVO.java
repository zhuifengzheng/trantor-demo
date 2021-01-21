package io.terminus.trantor.demo.model.b2c;

import io.terminus.trantor.api.annotation.BaseModel;
import io.terminus.trantor.api.annotation.TModel;
import io.terminus.trantor.api.annotation.TModelField;
import io.terminus.trantor.api.annotation.typemeta.TextMeta;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/**
 * @author liuyang
 * 2020-04-14 11:39
 */

@Data
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
@TModel(name = "银行信息", isTransient = true)
public class MDBankVO extends BaseModel<Long> {
    private static final long serialVersionUID = 8466129956469577974L;

    @TModelField(name = "开户银行", nullable = false)
    @TextMeta(length = 30)
    private String bankType;

    @TModelField(name = "开户名称", nullable = false)
    @TextMeta(length = 30)
    private String name;

    @TModelField(name = "银行账号", nullable = false)
    @TextMeta(length = 25)
    private String cardNo;
    
    @TModelField(name = "账户类型")
    private String accountType;

    @TModelField(name = "开户银行代码")
    private String bankCode;
}

