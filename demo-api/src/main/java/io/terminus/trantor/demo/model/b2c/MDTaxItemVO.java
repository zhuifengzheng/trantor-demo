package io.terminus.trantor.demo.model.b2c;

import io.terminus.trantor.api.annotation.BaseModel;
import io.terminus.trantor.api.annotation.TModel;
import io.terminus.trantor.api.annotation.TModelField;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.util.Date;

/**
 * @author liuyang
 * 2020-04-14 11:56
 */
@Data
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
@TModel(name = "税目信息", isTransient = true)
public class MDTaxItemVO extends BaseModel<Long> {
    private static final long serialVersionUID = -2685536402202302137L;

    @TModelField(name = "纳税人名称")
    private String taxpayer;

    @TModelField(name = "应税类别", nullable = false)
    private String taxableType;

    @TModelField(name = "税率", nullable = false)
    private String taxRate;

    @TModelField(name = "税代码", nullable = false)
    private String taxCode;

    @TModelField(name = "有效开始日期")
    private Date startAt;

    @TModelField(name = "有效结束日期")
    private Date endAt;

    @TModelField(name = "是否长期有效", nullable = false, defaultValue = "false")
    private Boolean isLongTerm;
}

