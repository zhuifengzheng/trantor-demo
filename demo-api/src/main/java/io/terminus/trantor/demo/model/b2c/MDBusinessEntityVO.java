package io.terminus.trantor.demo.model.b2c;

import io.terminus.trantor.api.annotation.*;
import io.terminus.trantor.api.annotation.type.Address;
import io.terminus.trantor.api.annotation.typemeta.DictionaryMeta;
import io.terminus.trantor.api.annotation.typemeta.TextMeta;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.util.Date;

/**
 * @Author: dingqiang
 * @Date: 2020/9/23 7:39 下午
 */
@Data
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
@TModel(name = "业务实体",mainField = "name", isTransient = true,
        fieldGroups = {
            @FieldGroup(fieldName = {"code", "name", "abbr", "type","relegationEnterpriseName", "manageEnterpriseName", "address","status"})
        })
public class MDBusinessEntityVO extends BaseModel<Long> {
    private static final long serialVersionUID = -2810292213902982820L;
    @TModelField(name = "名称")
    private String name;

    @TModelField(name = "编码")
    @TextMeta(rule = "STRING(ET)+TIMES(yyyy-MM-dd)+INCRE(1,6,4,1)+RANDOM(4,1)")
    private String code;

    @TModelField(name = "是否支持自提")
    private Boolean isSelfMention;

    @TModelField(name = "简码")
    @TextMeta(rule = "STRING(ETS)+TIMES(yyyy-MM-dd)+INCRE(1,6,4,1)")
    private String simpleCode;

    @TModelField(name = "缩写")
    private String abbr;

    @TModelField(name = "类型")
    @DictionaryMeta(clazz = BusinessEntityTypeDict.class)
    private String type;

    @TModelField(name = "图片", type = TModelFieldType.Image)
    private String logo;

    @TModelField(name = "描述")
    @TextMeta(length = 2048)
    private String desc;

    @TModelField(name = "状态")
    @DictionaryMeta(clazz = BusinessEntityStatusDict.class)
    private String status;

    @TModelField(name = "所属企业ID")
    private Long relegationEnterpriseId;

    @TModelField(name = "所属公司")
    private String relegationEnterpriseName;

    @TModelField(name = "经营企业ID")
    private Long manageEnterpriseId;

    @TModelField(name = "经营主体")
    private String manageEnterpriseName;

    @TModelField(name = "组织架构ID")
    private Long organizationId;

    @TModelField(name = "实体业务类型")
    private String businessType;

    @TModelField(name = "关联渠道ID")
    private Long channelId;

    @TModelField(name = "认证信息", type = TModelFieldType.Json)
    private CertificationAttribute certificationAttribute;

    /**
     * todo 经营时间应该是一个区间值，待讨论
     */
    @TModelField(name = "经营时间")
    private Date workHours;

    @TModelField(name = "地址")
    private Address address;
}
