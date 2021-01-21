package io.terminus.trantor.demo.model.facade.response;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.terminus.trantor.api.annotation.TModelField;
import io.terminus.trantor.api.annotation.type.Address;
import io.terminus.trantor.api.annotation.type.Attachment;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @author liuyang
 * 2020/10/28 3:29 下午
 */
@Data
@ApiModel
@EqualsAndHashCode(callSuper = true)
public class MDCarrierInfo extends MasterDataAbstractInfo {
    private static final long serialVersionUID = 6381463683473792793L;

    @ApiModelProperty("承运商id")
    private Long id;

    @ApiModelProperty("主体id")
    private Long enterpriseId;

    @ApiModelProperty("parent")
    private MDEnterpriseInfo parent;

    @ApiModelProperty("名称")
    private String name;

    @ApiModelProperty("曾用名")
    private String nameUsedBefore;

    @ApiModelProperty("简称")
    private String shortName;

    @ApiModelProperty("纳税人类别")
    private String taxpayerType;

    @ApiModelProperty("类型")
    private String type;

    @ApiModelProperty("统一社会信用代码")
    private String unifiedSocialCreditCode;

    @ApiModelProperty("法人姓名/个人姓名")
    private String legalRepresentativeName;

    @ApiModelProperty("证件类型")
    private String credentialsType;

    @ApiModelProperty("法人证件号/个人证件号")
    private String legalRepresentativeId;

    @ApiModelProperty("证件附件")
    private Attachment credentials;

    @ApiModelProperty("法人联系方式/个人联系方式")
    private String legalRepresentativeContact;

    @ApiModelProperty("企业类型")
    private String enterpriseType;

    @ApiModelProperty("注册资本(单位：万元)")
    private BigDecimal registeredCapital;

    @ApiModelProperty("经营状态")
    private String businessStatus;

    @ApiModelProperty("成立日期")
    private Date foundAt;

    @ApiModelProperty("营业开始时间")
    private Date businessBeginAt;

    @ApiModelProperty("营业截止时间")
    private Date businessEndAt;

    @ApiModelProperty("国家")
    private String country;

    @ApiModelProperty("地址对象")
    private Address address;

    @ApiModelProperty("经营范围")
    private String businessScope;

    @ApiModelProperty("编码")
    private String code;

    @ApiModelProperty("内部公司类型")
    private String internalType;

    @ApiModelProperty(value = "纳税人识别号")
    private String taxpayerCode;

    @ApiModelProperty(value = "开户银行")
    private String bankType;

    @ApiModelProperty(value = "开户名称")
    private String bankName;

    @ApiModelProperty(value = "银行账号")
    private String cardNo;

    @ApiModelProperty(value = "电话")
    private String phone;

    @ApiModelProperty(value = "公司介绍")
    private String introduction;

    @ApiModelProperty(value = "货币")
    private String currency;

    @ApiModelProperty(value = "父id")
    private Long parentId;

    @ApiModelProperty(value = "产业")
    private String industry;

    @ApiModelProperty("来源")
    private String source;

    @TModelField(name = "公司类型")
    private String companyType;

    @TModelField(name = "是否三证合一")
    private Boolean isThreeCertToOne;

    @TModelField(name = "营业执照号")
    private String businessLicenseCode;

    @TModelField(name = "营业执照扫描件")
    private Attachment businessLicense;

    @ApiModelProperty("组织机构代码")
    private String registerCode;

    @ApiModelProperty("官网")
    private String website;

    @ApiModelProperty("承运商身份类型")
    private String carrierType;

    @ApiModelProperty("承运商状态")
    private String carrierStatus;
}
