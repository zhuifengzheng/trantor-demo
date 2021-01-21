package io.terminus.trantor.demo.manager.model;

import io.terminus.trantor.api.annotation.*;
import io.terminus.trantor.api.annotation.type.Address;
import io.terminus.trantor.api.annotation.type.Attachment;
import io.terminus.trantor.api.annotation.typemeta.AttachmentMeta;
import io.terminus.trantor.api.annotation.typemeta.DictionaryMeta;
import io.terminus.trantor.api.annotation.typemeta.JsonMeta;
import io.terminus.trantor.api.annotation.typemeta.TextMeta;
import io.terminus.trantor.demo.model.b2c.*;
import io.terminus.trantor.module.base.dictionary.Country;
import io.terminus.trantor.module.base.dictionary.Currency;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import static io.terminus.trantor.api.annotation.IDRule.AUTO_INCREMENT;

/**
 * @author <a href="yzl249497@alibaba-inc.com">yangzhilin</a>
 * @description:企业
 * @date Create on 2020/4/14
 * @since version1.0 Copyright 2020 terminus.io All Rights Reserved.
 */
@Data
@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
@TModel(name = "企业", mainField = "name",
        indexes = {
                @Index(name = "uk_unifiedSocialCreditCode", columns = {"unifiedSocialCreditCode"}, unique = true)
        },
        idRule = @IDRule(rule = AUTO_INCREMENT),
        dbTableName = "md_enterprise"
)
public class MDEnterprise extends BaseModel<Long> {
    private static final long serialVersionUID = -1339017576829787150L;

    @TModelField(name = "编号", dbColumnName = "code")
    @TextMeta(rule = "STRING(CO)+TIMES(yyyy-MM-dd)+INCRE(1,6,4,1)")
    private String code;

    @TModelField(name = "外部编号", dbColumnName = "out_code")
    private String outCode;

    @TModelField(name = "名称", dbColumnName = "name")
    @NotNull(message = "名称不能为空")
    @TextMeta(length = 30)
    private String name;

    @TModelField(name = "曾用名", dbColumnName = "name_used_before")
    private String nameUsedBefore;

    @TModelField(name = "简称", dbColumnName = "short_name")
    @TextMeta(length = 30)
    private String shortName;

    @TModelField(name = "国家", dbColumnName = "country", defaultValue = "China")
    @DictionaryMeta(clazz = Country.class)
    private String country;

    @TModelField(name = "货币", dbColumnName = "currency")
    @DictionaryMeta(clazz = Currency.class)
    private String currency;

    @TModelField(name = "上级主体",dbColumnName = "parent_id")
    private Long parentId;

    @TModelField(name = "来源", dbColumnName = "source")
    @DictionaryMeta(clazz = SourceType.class)
    private String source;

    @TModelField(name = "业务身份", dbColumnName = "business_identity")
    @DictionaryMeta(clazz = BusinessIdentityType.class)
    @JsonMeta
    private List<String> businessIdentity;

    @TModelField(name = "类型", dbColumnName = "company_type")
    @DictionaryMeta(clazz = EntityCompanyType.class)
    private String companyType;

    @TModelField(name = "是否使用WMS", dbColumnName = "use_platform_wms")
    private Boolean usePlatformWms;

    @TModelField(name = "是否使用OMS", dbColumnName = "use_platform_oms")
    private Boolean usePlatformOms;

    @TModelField(name = "是否使用TMS", dbColumnName = "use_platform_tms")
    private Boolean usePlatformTms;

    @TModelField(name = "组织机构类型", dbColumnName = "type")
    @NotNull(message = "类型不能为空")
    @DictionaryMeta(clazz = EnterpriseType.class)
    private String type;

    /**
     * 承运商设置为CARRIER
     */
    @TModelField(name = "企业功能类型", dbColumnName = "type_code")
    private String typeCode;

    @TModelField(name = "统一社会信用代码", dbColumnName = "unified_social_credit_code")
    @TextMeta(length = 18)
    private String unifiedSocialCreditCode;

    @TModelField(name = "法人姓名/个人姓名", dbColumnName = "legal_representative_name")
    @TextMeta(length = 30)
    private String legalRepresentativeName;

    @TModelField(name = "证件类型", dbColumnName = "credentials_type")
    @DictionaryMeta(clazz = CertificateType.class)
    private String credentialsType;

    @TModelField(name = "法人证件号/个人证件号", dbColumnName = "legal_representative_id")
    private String legalRepresentativeId;

    @TModelField(name = "证件附件", dbColumnName = "credentials")
    @AttachmentMeta
    private Attachment credentials;

    @TModelField(name = "法人联系方式/个人联系方式", dbColumnName = "legal_representative_contact")
    private String legalRepresentativeContact;

    @TModelField(name = "企业类型", dbColumnName = "enterprise_type")
    @DictionaryMeta(clazz = CapitalType.class)
    private String enterpriseType;

    @TModelField(name = "注册资本(单位：万元)", dbColumnName = "registered_capital")
    private BigDecimal registeredCapital;

    @TModelField(name = "经营状态", dbColumnName = "business_status")
    @DictionaryMeta(clazz = OperatingStatus.class)
    private String businessStatus;

    @TModelField(name = "成立日期", dbColumnName = "found")
    private Date foundAt;

    @TModelField(name = "营业开始时间", dbColumnName = "business_begin_at")
    private Date businessBeginAt;

    @TModelField(name = "营业截止时间", dbColumnName = "business_end_at")
    private Date businessEndAt;

    @TModelField(name = "省编码", dbColumnName = "province_id")
    private String provinceId;

    @TModelField(name = "城市编码", dbColumnName = "city_id")
    private String cityId;

    @TModelField(name = "地区编码", dbColumnName = "district_id")
    private String districtId;

    @TModelField(name = "街道", dbColumnName = "street")
    private String street;

    @TModelField(name = "详细地址", dbColumnName = "detail")
    private String detail;

    @TModelField(name = "冗余地址信息", dbColumnName = "address_json", type = TModelFieldType.Json)
    private Address address;

    @TModelField(name = "经营范围", dbColumnName = "business_scope")
    @TextMeta(length = 240)
    private String businessScope;

    @TModelField(name = "官网", dbColumnName = "website")
    @TextMeta(length = 240)
    private String website;

    @AttachmentMeta(showType = AttachmentMeta.ShowType.ALL)
    @TModelField(name = "其他附件", dbColumnName = "attachment")
    private Attachment attachment;

    @TModelField(name = "是否三证合一", dbColumnName = "three_cert_to_one")
    private Boolean isThreeCertToOne;

    @TModelField(name = "营业执照号",dbColumnName = "businessLicense_code")
    private String businessLicenseCode;

    @TModelField(name = "营业执照扫描件", dbColumnName = "business_license")
    @AttachmentMeta
    private Attachment businessLicense;

    @TModelField(name =  "组织机构代码", dbColumnName = "register_code")
    private String registerCode;
    
    @TModelField(name = "纳税人类别", dbColumnName = "tax_payer_type")
    @DictionaryMeta(clazz = TaxPayerType.class)
    private String taxpayerType;

    @TModelField(name = "纳税人识别号",dbColumnName = "taxpayer_code")
    private String taxpayerCode;

    @TModelField(name = "开户银行", dbColumnName = "bank_type")
    private String bankType;

    @TModelField(name = "开户名称", dbColumnName = "bank_name")
    private String bankName;

    @TModelField(name = "银行账号", dbColumnName = "card_no")
    private String cardNo;

    @TModelField(name = "电话", type = TModelFieldType.Phone,dbColumnName = "phone")
    private String phone;
    
    @TModelField(name = "公司介绍")
    private String introduction;

    @TModelField(name = "admin用户id",dbColumnName = "admin_user_id")
    private Long adminUserId;

}
