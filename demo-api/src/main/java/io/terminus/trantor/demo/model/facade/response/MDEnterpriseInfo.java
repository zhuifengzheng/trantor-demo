/*
 * Copyright (c) 2020. 杭州端点网络科技有限公司.  All rights reserved.
 */

package io.terminus.trantor.demo.model.facade.response;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.terminus.trantor.api.annotation.type.Address;
import io.terminus.trantor.api.annotation.type.Attachment;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @author lsk mailto:liushaokang@terminus.io
 * @create 2020-06-30 11:17 上午
 **/
@Data
@ApiModel
@EqualsAndHashCode(callSuper = true)
public class MDEnterpriseInfo extends MasterDataAbstractInfo {
    private static final long serialVersionUID = -8010980087685286509L;

    @ApiModelProperty("企业ID")
    private Long id;

    @ApiModelProperty("编号")
    private String code;

    @ApiModelProperty("外部编号")
    private String outCode;

    @ApiModelProperty("名称")
    private String name;

    @ApiModelProperty("纳税人类别")
    private String taxpayerType;

    @ApiModelProperty("曾用名")
    private String nameUsedBefore;

    @ApiModelProperty("简称")
    private String shortName;

    @ApiModelProperty("类型")
    private String type;

    @ApiModelProperty("功能类型")
    private String typeCode;

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

    @ApiModelProperty("省编码")
    private String provinceId;

    @ApiModelProperty("城市编码")
    private String cityId;

    @ApiModelProperty("地区编码")
    private String districtId;

    @ApiModelProperty("街道编码")
    private String street;

    @ApiModelProperty("详细地址")
    private String detail;

    @ApiModelProperty("地址对象")
    private Address address;

    @ApiModelProperty("经营范围")
    private String businessScope;

    @ApiModelProperty("官网")
    private String website;

    @ApiModelProperty("其他附件")
    private Attachment attachment;

    @ApiModelProperty("是否使用WMS")
    private Boolean usePlatformWms;

    @ApiModelProperty("是否使用OMS")
    private Boolean usePlatformOms;

    @ApiModelProperty("是否使用TMS")
    private Boolean usePlatformTms;

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

    @ApiModelProperty(value = "内部公司类型")
    private String internalType;

    @ApiModelProperty(value = "内部公司状态")
    private String status;

    @ApiModelProperty(value = "上级公司")
    private MDEnterpriseInfo parent;

    @ApiModelProperty(value = "产业")
    private String industry;

    @ApiModelProperty(value = "来源")
    private String source;

    @ApiModelProperty("是否三证合一")
    private Boolean isThreeCertToOne;

    @ApiModelProperty("公司类型")
    private String companyType;

    @ApiModelProperty("营业执照号")
    private String businessLicenseCode;

    @ApiModelProperty("组织机构代码")
    private String registerCode;

    @ApiModelProperty("管理员账号id")
    private Long adminUserId;

    @ApiModelProperty("是否有孩子节点")
    private Boolean hasChildren;
}
