package io.terminus.trantor.demo.model.b2c;

import io.terminus.trantor.api.annotation.*;
import io.terminus.trantor.api.annotation.type.Address;
import io.terminus.trantor.api.annotation.type.Attachment;
import io.terminus.trantor.api.annotation.typemeta.*;
import io.terminus.trantor.module.base.dictionary.Country;
import io.terminus.trantor.module.base.dictionary.Currency;
import io.terminus.trantor.module.base.model.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

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
@TModel(name = "企业", mainField = "name", isTransient = true, fieldGroups = {@FieldGroup(fieldName = {"id", "name", "legalRepresentativeName", "code", "outCode"})})
public class MDEnterpriseVO extends BaseModel<Long> {

    private static final long serialVersionUID = -896142742835187759L;
    @TModelField(name = "编号")
    private String code;

    @TModelField(name = "外部编号")
    private String outCode;

    @TModelField(name = "名称")
    @NotNull(message = "名称不能为空")
    @TextMeta(length = 30)
    private String name;

    @TModelField(name = "曾用名")
    private String nameUsedBefore;

    @TModelField(name = "简称")
    @TextMeta(length = 30)
    private String shortName;

    @TModelField(name = "类型")
    @NotNull(message = "类型不能为空")
    @DictionaryMeta(clazz = EnterpriseType.class)
    private String type;

    @TModelField(name = "纳税人类型")
    @DictionaryMeta(clazz = TaxPayerType.class)
    private String taxpayerType;

    @TModelField(name = "统一社会信用代码")
        @TextMeta(length = 18)
    private String unifiedSocialCreditCode;

    @TModelField(name = "法人姓名/个人姓名")
    @TextMeta(length = 30)
    private String legalRepresentativeName;

    @TModelField(name = "证件类型")
    @DictionaryMeta(clazz = CertificateType.class)
    private String credentialsType;

    @TModelField(name = "法人证件号/个人证件号")
    private String legalRepresentativeId;

    @TModelField(name = "证件附件")
    @AttachmentMeta
    private Attachment credentials;

    @TModelField(name = "法人联系方式/个人联系方式")
    private String legalRepresentativeContact;

    @TModelField(name = "企业类型")
    @DictionaryMeta(clazz = CapitalType.class)
    private String enterpriseType;

    @TModelField(name = "注册资本(单位：万元)")
    private BigDecimal registeredCapital;

    @TModelField(name = "经营状态")
    @DictionaryMeta(clazz = OperatingStatus.class)
    private String businessStatus;

    @TModelField(name = "成立日期", type = TModelFieldType.DateTime)
    private Date foundAt;

    @TModelField(name = "营业开始时间", type = TModelFieldType.DateTime)
    private Date businessBeginAt;

    @TModelField(name = "营业截止时间", type = TModelFieldType.DateTime)
    private Date businessEndAt;

    @TModelField(name = "国家")
    @DictionaryMeta(clazz = Country.class)
    private String country;

    @TModelField(name = "企业地址信息")
    @AddressMeta(containsPostcode = false)
    private Address address;

    @AttachmentMeta(showType = AttachmentMeta.ShowType.ALL)
    @TModelField(name = "其他附件")
    private Attachment attachment;

    @TModelField(name = "经营范围")
    @TextMeta(length = 240)
    private String businessScope;

    @TModelField(name = "官网")
    @TextMeta(length = 240)
    private String website;

    @TModelField(name = "银行信息")
    @RelationMeta(name = "MDBankVO", modelClass = MDBankVO.class)
    private List<MDBankVO> banks;

    @TModelField(name = "联系人信息")
    @RelationMeta(name = "MDContactVO", modelClass = MDContactVO.class)
    private List<MDContactVO> contacts;

    @TModelField(name = "税目信息")
    @RelationMeta(name = "MDTaxItemVO", modelClass = MDTaxItemVO.class)
    private List<MDTaxItemVO> taxItems;

    @TModelField(name = "企业用户信息")
    @RelationMeta(name = "MDEnterpriseUserVO", modelClass = MDEnterpriseUserVO.class)
    private List<MDEnterpriseUserVO> users;

    @TModelField(name = "股东")
    @RelationMeta(name = "MDShareHolderVO", modelClass = MDShareHolderVO.class)
    private List<MDShareHolderVO> shareHolders;

    @TModelField(name = "是否使用WMS")
    private Boolean usePlatformWms;

    @TModelField(name = "是否使用OMS")
    private Boolean usePlatformOms;

    @TModelField(name = "是否使用TMS")
    private Boolean usePlatformTms;

    @TModelField(name = "父公司")
    @RelationMeta(name = "MDEnterpriseVO", modelClass = MDEnterpriseVO.class)
    private MDEnterpriseVO parent;

    @TModelField(name = "是否叶子节点")
    private Boolean isLeaf;

    @TModelField(name =  "组织机构代码")
    private String registerCode;

    @TModelField(name = "纳税人识别号")
    private String taxpayerCode;

    @TModelField(name = "开户银行")
    @DictionaryMeta(clazz = BankName.class)
    private String bankType;

    @TModelField(name = "开户名称")
    private String bankName;

    @TModelField(name = "银行账号")
    private String cardNo;

    @TModelField(name = "电话", type = TModelFieldType.Phone)
    private String phone;

    @TModelField(name = "公司介绍",type = TModelFieldType.RichText)
    private String introduction;

    @TModelField(name = "货币")
    @DictionaryMeta(clazz = Currency.class)
    private String currency;

    @TModelField(name = "内部公司类型")
    @DictionaryMeta(clazz = InternalType.class)
    private String internalType;

    @TModelField(name = "内部公司状态")
    @DictionaryMeta(clazz = InternalStatus.class)
    private String status;

    @TModelField(name = "引入")
    @RelationMeta(name = "Import", modelClass = MDEnterpriseVO.class)
    private MDEnterpriseVO importEnterprise;

    @TModelField(name = "产业")
    @DictionaryMeta(clazz = IndustryType.class)
    private String industry;

    @TModelField(name = "是否有孩子节点")
    private Boolean hasChildren;

    @TModelField(name = "管理账号")
    @RelationMeta(name = "UserVO", modelClass = User.class)
    private User adminUser;

}
