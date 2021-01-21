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

import java.math.BigDecimal;

@Data
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
@TModel(name = "股东", isTransient = true)
public class MDShareHolderVO extends BaseModel<Long> {

    @TModelField(name = "关联企业", nullable = false)
    @RelationMeta(name = "MDEnterpriseVO", modelClass = MDEnterpriseVO.class)
    private MDEnterpriseVO enterprise;

    @TModelField(name = "股东姓名", nullable = false)
    private String name;

    @TModelField(name = "证件类型")
    private String credentialsType;

    @TModelField(name = "证件号")
    private String legalRepresentativeId;

    @TModelField(name = "投资额")
    private BigDecimal investmentAmount;

    @TModelField(name = "投资比例")
    private BigDecimal investmentRate;

    @TModelField(name = "职务")
    private String jobTitle;
}
