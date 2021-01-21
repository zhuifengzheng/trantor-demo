package io.terminus.trantor.demo.manager.model;

import io.terminus.trantor.api.annotation.*;
import io.terminus.trantor.api.annotation.type.Address;
import io.terminus.trantor.api.annotation.typemeta.DictionaryMeta;
import io.terminus.trantor.api.annotation.typemeta.TextMeta;
import io.terminus.trantor.module.base.dictionary.Country;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * 地址主数据
 * ownerID+ownerType+ownerUseWay唯一确定一个地址
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
@EqualsAndHashCode(callSuper = true)
@TModel(name = "地址主数据", dbTableName = "md_address", deleteStrategy = DeleteStrategy.Logical)
public class MDAddress extends BaseModel<Long> {
    private static final long serialVersionUID = 2175457138932847219L;

    @TModelField(name = "编码", dbColumnName = "code")
    @TextMeta(rule = "STRING(ADDR)+TIMES(yyyy-MM-dd)+INCRE(1,6,4,1)")
    private String code;

    @TModelField(name = "所属者ID", dbColumnName = "owner_id")
    private Long ownerId;

    @TModelField(name = "所属者类型", dbColumnName = "owner_type")
    private String ownerType;

    @TModelField(name = "所属者使用方式", dbColumnName = "owner_use_way")
    private String ownerUseWay;

    @TModelField(name = "联系人", dbColumnName = "enterprise_user_id")
    private Long enterpriseUserId;

    @TModelField(name = "联系人姓名", dbColumnName = "contact_name")
    private String contactName;

    @TModelField(name = "联系人手机", dbColumnName = "contact_phone")
    private String contactPhone;

    @TModelField(name = "地址坐标经度", dbColumnName = "longitude")
    private String longitude;

    @TModelField(name = "地址坐标纬度", dbColumnName = "latitude")
    private String latitude;

    @TModelField(name = "国家", dbColumnName = "country", defaultValue = "China")
    @DictionaryMeta(clazz = Country.class)
    private String country;

    @TModelField(name = "省编码", dbColumnName = "province_id")
    private String provinceId;

    @TModelField(name = "城市编码", dbColumnName = "city_id")
    private String cityId;

    @TModelField(name = "地区编码", dbColumnName = "district_id")
    private String districtId;

    @TModelField(name = "街道", dbColumnName = "street")
    private String street;

    @TModelField(name = "详细地址", dbColumnName = "address_detail")
    private String addressDetail;

    @TModelField(name = "冗余地址信息", dbColumnName = "address_json", type = TModelFieldType.Json)
    private Address address;

    @TModelField(name = "邮编", dbColumnName = "post_code")
    private String postCode;

    @TModelField(name = "状态", dbColumnName = "status", defaultValue = AddressStatus.ENABLE)
    @DictionaryMeta(clazz = AddressStatus.class)
    private String status;

    @TModelField(name = "是否默认", dbColumnName = "is_default", defaultValue = "true")
    private Boolean isDefault;

}
