/*
 * Copyright (c) 2020. 杭州端点网络科技有限公司.  All rights reserved.
 */

package io.terminus.trantor.demo.model.b2c;

import io.terminus.trantor.api.annotation.*;
import io.terminus.trantor.api.annotation.typemeta.DictionaryMeta;
import io.terminus.trantor.api.annotation.typemeta.TextMeta;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * @author lsk mailto:liushaokang@terminus.io
 * @create 2020-06-15 2:30 下午
 **/
@Data
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
@TModel(name = "基础业务实体",
        mainField = "name",
        idRule = @IDRule(rule = IDRule.AUTO_INCREMENT),
        dbTableName = "md_business_entity"
)
public class MDBusinessEntity extends BaseModel<Long> {
    private static final long serialVersionUID = -6557712627637252073L;

    @TModelField(name = "实体名称", dbColumnName = "name")
    private String name;

    @TModelField(name = "实体编码", dbColumnName = "code")
    @TextMeta(rule = "STRING(ET)+TIMES(yyyy-MM-dd)+INCRE(1,6,4,1)+RANDOM(4,1)")
    private String code;

    @TModelField(name = "是否支持自提", dbColumnName = "is_self_mention")
    private Boolean isSelfMention;

    @TModelField(name = "简码", dbColumnName = "simple_code")
    @TextMeta(rule = "STRING(ETS)+TIMES(yyyy-MM-dd)+INCRE(1,6,4,1)")
    private String simpleCode;

    @TModelField(name = "缩写", dbColumnName = "abbr")
    private String abbr;

    @TModelField(name = "类型", dbColumnName = "type")
    @DictionaryMeta(clazz = BusinessEntityTypeDict.class)
    private String type;

    @TModelField(name = "图片", type = TModelFieldType.Image, dbColumnName = "logo")
    private String logo;

    @TModelField(name = "描述", dbColumnName = "desc")
    @TextMeta(length = 2048)
    private String desc;

    @TModelField(name = "实体状态", dbColumnName = "status")
    @DictionaryMeta(clazz = BusinessEntityStatusDict.class)
    private String status;

    @TModelField(name = "所属企业ID", dbColumnName = "relegation_enterprise_id")
    private Long relegationEnterpriseId;

    @TModelField(name = "关联业务实体id", dbColumnName = "relegation_business_entity_id")
    private Long relegationBusinessEntityId;

    @TModelField(name = "经营企业ID", dbColumnName = "manage_enterprise_id")
    private Long manageEnterpriseId;

    @TModelField(name = "组织架构ID", dbColumnName = "organization_id")
    private Long organizationId;

    @TModelField(name = "实体业务类型", dbColumnName = "business_type")
    private String businessType;

    @TModelField(name = "关联渠道ID", dbColumnName = "channel_id")
    private Long channelId;

    @TModelField(name = "认证信息", dbColumnName = "certification", type = TModelFieldType.Json)
    private CertificationAttribute certificationAttribute;

    @TModelField(name = "外部编码", dbColumnName = "out_code")
    private String outCode;

    // 新增
    @TModelField(name = "阶段", dbColumnName = "stage")
    @DictionaryMeta(clazz = BussinessEntityStageDict.class)
    private String stage;

    @TModelField(name = "上级实体", dbColumnName = "parent_entity_id")
    private Long parentEntityId;

    @TModelField(name = "层级", dbColumnName = "level")
    private Integer level;

    @TModelField(name = "是否末级", dbColumnName = "is_last_stage")
    private Boolean isLastStage;

    @TModelField(name = "联系人", dbColumnName = "contract_enterprised_user_id")
    private Long contactEnterprisedUserId;

    @TModelField(name = "手机国际区号", dbColumnName = "mobile_code")
    private String mobileCode;

    @TModelField(name = "手机", dbColumnName = "mobile")
    private String mobile;

    @TModelField(name = "地址信息", dbColumnName = "md_address_id")
    private Long mdAddressId;

    @TModelField(name = "上班时间", dbColumnName = "onWorkTime")
    private Date onWorkTime;

    @TModelField(name = "下班时间", dbColumnName = "offWorkTime")
    private Date offWorkTime;


    @TModelField(name = "层级类型", dbColumnName = "level_type")
    private String levelType;

    @TModelField(name = "上架是否审核", dbColumnName = "my_is_on_shelf_audit", defaultValue = "false")
    private Boolean myIsOnShelfAudit;

    @TModelField(name = "仓库面积", dbColumnName = "warehouse_area")
    private BigDecimal warehouseArea;

    @TModelField(name = "可配送", dbColumnName = "can_be_delivered")
    private Boolean canBeDelivered;

    @TModelField(name = "关系类型",dbColumnName="warehouse_relation_type")
    @DictionaryMeta(clazz = RelationType.class)
    private String warehouseRelationType;

    @TModelField(name = "仓库类型", dbColumnName = "warehouse_type")
    @DictionaryMeta(clazz = WarehouseType.class)
    private String warehouseType;

    @TModelField(name = "业务范围",dbColumnName="warehouse_biz_area")
    private String warehouseBizArea;

    @TModelField(name = "业务范围",type = TModelFieldType.Json,dbColumnName="warehouse_biz_areas")
    private List<String> warehouseBizAreas;

    @TModelField(name = "库存更新方式",dbColumnName="warehouse_inventory_access")
    private String warehouseInventoryAccess;

    @TModelField(name="用途",dbColumnName = "purpose")
    private String purpose;

    @TModelField(name="是否自营",dbColumnName = "is_self_run")
    private Boolean isSelfRun;

}
