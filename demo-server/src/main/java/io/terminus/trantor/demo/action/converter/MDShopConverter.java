/*
 * Copyright (c) 2020. 杭州端点网络科技有限公司.  All rights reserved.
 */

package io.terminus.trantor.demo.action.converter;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import io.swagger.annotations.ApiModelProperty;

import io.terminus.trantor.api.annotation.type.Address;
import io.terminus.trantor.demo.manager.model.MDAddress;
import io.terminus.trantor.demo.manager.model.MDChannel;
import io.terminus.trantor.demo.manager.model.MDEnterprise;
import io.terminus.trantor.demo.model.b2c.*;
import io.terminus.trantor.demo.model.facade.request.MDShopPageRequest;
import io.terminus.trantor.demo.model.facade.response.CertificationAttributeInfo;
import io.terminus.trantor.demo.model.facade.response.MDChannelInfo;
import io.terminus.trantor.demo.model.facade.response.MDShopFullInfo;
import io.terminus.trantor.module.base.model.User;

import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/**
 * @author lsk mailto:liushaokang@terminus.io
 * @create 2020-06-16 3:17 下午
 **/
public class MDShopConverter {

    public static Map<String, Object> converter(MDShopPageRequest request) {
        Map<String, Object> stringMap = Maps.newHashMap();
        stringMap.put(MDBusinessEntity.id_field, request.getId());
        stringMap.put(MDBusinessEntity.channelId_field, request.getChannelId());
        stringMap.put(MDBusinessEntity.name_field, request.getName());
        stringMap.put(MDBusinessEntity.code_field, request.getCode());
        stringMap.put(MDBusinessEntity.businessType_field, request.getShopType());
        stringMap.put(MDBusinessEntity.relegationEnterpriseId_field, request.getRelegationEnterpriseId());
        stringMap.put(MDBusinessEntity.type_field, BusinessEntityTypeDict.SHOP);
        return stringMap;
    }
    public static List<MDShopVO> converter(List<MDShopFullInfo> shopFullInfos) {
        List<MDShopVO> mDShopVOlist = Lists.newArrayList();
        for (MDShopFullInfo mDShopFullInfo : shopFullInfos) {
            mDShopVOlist.add(convertFromMDShopFullInfo(mDShopFullInfo));
        }

        return mDShopVOlist;
    }

    public static List<B2cMDShopVO> converterB2c(List<MDShopFullInfo> shopFullInfos) {
        List<B2cMDShopVO> mDShopVOlist = Lists.newArrayList();
        for (MDShopFullInfo mDShopFullInfo : shopFullInfos) {
            mDShopVOlist.add(convertFromMDShopFullInfoB2c(mDShopFullInfo));
        }

        return mDShopVOlist;
    }

    public static MDShopVO convertFromMDShopFullInfo(MDShopFullInfo shopFullInfo) {
        if (shopFullInfo == null) {
            return null;
        }

        MDShopVO mDShopVO = new MDShopVO();
        mDShopVO.setLogo(shopFullInfo.getLogo());
        mDShopVO.setDesc(shopFullInfo.getDesc());
        mDShopVO.setName(shopFullInfo.getName());
        mDShopVO.setIsSelfMention(shopFullInfo.getIsSelfMention());
        mDShopVO.setStatus(shopFullInfo.getStatus());
        mDShopVO.setLatitude(shopFullInfo.getLatitude());
        mDShopVO.setLongitude(shopFullInfo.getLongitude());
        mDShopVO.setContactName(shopFullInfo.getContactName());
        mDShopVO.setContactPhone(shopFullInfo.getContactPhone());
        mDShopVO.setAddress(shopFullInfo.getAddress());
        mDShopVO.setRelegationEnterprise(MDEnterpriseConverter.converter(shopFullInfo.getRelegationEnterpriseInfo()));
        mDShopVO.setManageEnterprise(MDEnterpriseConverter.converter(shopFullInfo.getManageEnterpriseInfo()));
        mDShopVO.setCode(shopFullInfo.getCode());
        mDShopVO.setShopType(shopFullInfo.getShopType());
        mDShopVO.setChannel(MDChannelConverter.converter(shopFullInfo.getChannelInfo()));
        mDShopVO.setCreatedAt(shopFullInfo.getCreatedAt());
        mDShopVO.setUpdatedAt(shopFullInfo.getUpdatedAt());
        mDShopVO.setCreatedBy(shopFullInfo.getCreatedBy());
        mDShopVO.setUpdatedBy(shopFullInfo.getUpdatedBy());
        mDShopVO.setId(shopFullInfo.getId());
        mDShopVO.setOutCode(shopFullInfo.getOutCode());
        mDShopVO.setMyIsOnShelfAudit(shopFullInfo.getMyIsOnShelfAudit());

        CertificationAttributeInfo certificationAttributeInfo = shopFullInfo.getCertificationAttributeInfo();
        mDShopVO.setAccessToken(certificationAttributeInfo.getAccessToken());
        mDShopVO.setAppKey(certificationAttributeInfo.getAppKey());
        mDShopVO.setAppSecret(certificationAttributeInfo.getAppSecret());
        mDShopVO.setGateWay(certificationAttributeInfo.getGateWay());
        return mDShopVO;
    }

    public static B2cMDShopVO convertFromMDShopFullInfoB2c(MDShopFullInfo shopFullInfo) {
        if (shopFullInfo == null) {
            return null;
        }

        B2cMDShopVO mDShopVO = new B2cMDShopVO();
        mDShopVO.setLogo("logo");
        mDShopVO.setDesc("描述");
        mDShopVO.setName("测试名字");
        mDShopVO.setIsSelfMention(shopFullInfo.getIsSelfMention());
        mDShopVO.setStatus(shopFullInfo.getStatus());
        mDShopVO.setLatitude(shopFullInfo.getLatitude());
        mDShopVO.setLongitude(shopFullInfo.getLongitude());
        mDShopVO.setContactName("xxx公司");
        mDShopVO.setContactPhone(shopFullInfo.getContactPhone());
        mDShopVO.setAddress(shopFullInfo.getAddress());
        mDShopVO.setRelegationEnterprise(MDEnterpriseConverter.converter(shopFullInfo.getRelegationEnterpriseInfo()));
        mDShopVO.setManageEnterprise(MDEnterpriseConverter.converter(shopFullInfo.getManageEnterpriseInfo()));
        mDShopVO.setCode(shopFullInfo.getCode());
        mDShopVO.setShopType(shopFullInfo.getShopType());
        mDShopVO.setChannel(MDChannelConverter.converter(shopFullInfo.getChannelInfo()));
        mDShopVO.setCreatedAt(shopFullInfo.getCreatedAt());
        mDShopVO.setUpdatedAt(shopFullInfo.getUpdatedAt());
        mDShopVO.setCreatedBy(shopFullInfo.getCreatedBy());
        mDShopVO.setUpdatedBy(shopFullInfo.getUpdatedBy());
        mDShopVO.setId(123L);
        mDShopVO.setOutCode(shopFullInfo.getOutCode());
        mDShopVO.setMyIsOnShelfAudit(shopFullInfo.getMyIsOnShelfAudit());

        CertificationAttributeInfo certificationAttributeInfo = shopFullInfo.getCertificationAttributeInfo();
        mDShopVO.setAccessToken(certificationAttributeInfo.getAccessToken());
        mDShopVO.setAppKey(certificationAttributeInfo.getAppKey());
        mDShopVO.setAppSecret(certificationAttributeInfo.getAppSecret());
        mDShopVO.setGateWay(certificationAttributeInfo.getGateWay());

        MDChannelVO mdChannelInfo = new MDChannelVO();
        mdChannelInfo.setType("ONLINE");
        mDShopVO.setChannel(mdChannelInfo);

        mDShopVO.setGrantAuthorization(0);
        return mDShopVO;
    }

    public static MDShopFullInfo converterShopFullInfo(MDBusinessEntity entity, MDAddress address, MDEnterprise relegationEnterprise, MDEnterprise manageEnterprise, MDChannel channel, MDBusinessEntity parentEntity) {
        MDShopFullInfo mDShopFullInfo = new MDShopFullInfo();
        mDShopFullInfo.setId(entity.getId());
        mDShopFullInfo.setLogo(entity.getLogo());
        mDShopFullInfo.setDesc(entity.getDesc());
        mDShopFullInfo.setName(entity.getName());
        mDShopFullInfo.setCode(entity.getCode());
        mDShopFullInfo.setIsSelfMention(entity.getIsSelfMention());
        mDShopFullInfo.setStatus(entity.getStatus());
        mDShopFullInfo.setShopType(entity.getBusinessType());
        mDShopFullInfo.setCreatedAt(entity.getCreatedAt());
        mDShopFullInfo.setUpdatedAt(entity.getUpdatedAt());
        mDShopFullInfo.setCreatedBy(entity.getCreatedBy());
        mDShopFullInfo.setUpdatedBy(entity.getUpdatedBy());
        mDShopFullInfo.setOutCode(entity.getOutCode());
        mDShopFullInfo.setMyIsOnShelfAudit(entity.getMyIsOnShelfAudit());
        mDShopFullInfo.setStage(entity.getStage());
        mDShopFullInfo.setLevel(entity.getLevel());
        mDShopFullInfo.setIsLastStage(entity.getIsSelfMention());
        mDShopFullInfo.setMobileCode(entity.getMobileCode());
        mDShopFullInfo.setOnWorkTime(entity.getOnWorkTime());
        mDShopFullInfo.setOffWorkTime(entity.getOffWorkTime());

        CertificationAttribute certificationAttribute = entity.getCertificationAttribute();
        if (Objects.nonNull(certificationAttribute)) {
            CertificationAttributeInfo certificationAttributeInfo = new CertificationAttributeInfo();
            certificationAttributeInfo.setAccessToken(certificationAttribute.getAccessToken());
            certificationAttributeInfo.setAppKey(certificationAttribute.getAppKey());
            certificationAttributeInfo.setAppSecret(certificationAttribute.getAppSecret());
            certificationAttributeInfo.setGateWay(certificationAttribute.getGateWay());

            mDShopFullInfo.setCertificationAttributeInfo(certificationAttributeInfo);
        }

        if (Objects.nonNull(relegationEnterprise)) {
//            mDShopFullInfo.setRelegationEnterpriseInfo(MDEnterpriseConverter.converter(relegationEnterprise,null));
        }
        if (Objects.nonNull(manageEnterprise)) {
//            mDShopFullInfo.setManageEnterpriseInfo(MDEnterpriseConverter.converter(manageEnterprise,null));
        }

        if (Objects.nonNull(address)) {
            mDShopFullInfo.setContactName(address.getContactName());
            mDShopFullInfo.setContactPhone(address.getContactPhone());
            mDShopFullInfo.setLongitude(address.getLongitude());
            mDShopFullInfo.setLatitude(address.getLatitude());
            mDShopFullInfo.setAddress(address.getAddress());
        }
        if (Objects.nonNull(parentEntity)) {
            mDShopFullInfo.setParentEntity(converterShopFullInfo(parentEntity, null, null, null, null, null));
        }

        if (Objects.nonNull(channel)) {
//            mDShopFullInfo.setChannelInfo(MDChannelConverter.converter(null, channel));
        }


        return mDShopFullInfo;
    }

//    public static CertificationAttributeInfo converter(CertificationAttribute certificationAttribute) {
//        if (Objects.isNull(certificationAttribute)) {
//            return null;
//        }
//
//        CertificationAttributeInfo certificationAttributeInfo = new CertificationAttributeInfo();
//        certificationAttributeInfo.setAccessToken(certificationAttribute.getAccessToken());
//        certificationAttributeInfo.setAppKey(certificationAttribute.getAppKey());
//        certificationAttributeInfo.setAppSecret(certificationAttribute.getAppSecret());
//        certificationAttributeInfo.setGateWay(certificationAttribute.getGateWay());
//
//        return certificationAttributeInfo;
//    }

//    public static MDBusinessEntity converter(MDShopUpdateRequest request) {
//        MDBusinessEntity entity = new MDBusinessEntity();
//        entity.setId(request.getId());
//        entity.setName(request.getName());
//        entity.setType(BusinessEntityTypeDict.SHOP);
//        entity.setIsSelfMention(request.getIsSelfMention() == null ? false : request.getIsSelfMention());
//        entity.setMyIsOnShelfAudit(request.getMyIsOnShelfAudit());
//        entity.setRelegationEnterpriseId(request.getRelegationEnterpriseId());
//        entity.setManageEnterpriseId(request.getManageEnterpriseId());
//        entity.setStatus(BusinessEntityStatusDict.ENABLED);
//        entity.setManageEnterpriseId(request.getManageEnterpriseId());
//        entity.setRelegationEnterpriseId(request.getRelegationEnterpriseId());
//        entity.setBusinessType(request.getShopType());
//        entity.setChannelId(request.getChannelId());
//        entity.setStatus(request.getStatus());
//        entity.setLogo(request.getLogo());
//        entity.setDesc(request.getDesc());
//        entity.setOutCode(request.getOutCode());
//        entity.setStage(request.getStage());
//        entity.setParentEntityId(request.getParentEntityId());
//        entity.setLevel(request.getLevel());
//        entity.setIsLastStage(request.getIsSelfMention());
//        entity.setMobileCode(request.getMobileCode());
//        entity.setOnWorkTime(request.getOnWorkTime());
//        entity.setOffWorkTime(request.getOffWorkTime());
//
//        if (request.getCertificationAttributeParam() != null) {
//            CertificationAttributeParam attributeParam = request.getCertificationAttributeParam();
//            CertificationAttribute attribute = new CertificationAttribute();
//            attribute.setAccessToken(attributeParam.getAccessToken());
//            attribute.setAppKey(attributeParam.getAppKey());
//            attribute.setAppSecret(attributeParam.getAppSecret());
//            attribute.setGateWay(attributeParam.getGateWay());
//
//            entity.setCertificationAttribute(attribute);
//        }
//
//        if(Objects.nonNull(request.getUpdatedBy())){
//            User user = new User();
//            user.setId(Long.valueOf(request.getUpdatedBy()));
//            entity.setUpdatedBy(user);
//        }
//
//        return entity;
//    }
//
//    public static MDBusinessEntity converter(MDShopCreateRequest request) {
//        MDBusinessEntity entity = new MDBusinessEntity();
//        entity.setName(request.getName());
//        entity.setIsSelfMention(request.getIsSelfMention() == null ? false : request.getIsSelfMention());
//        entity.setType(BusinessEntityTypeDict.SHOP);
//        entity.setRelegationEnterpriseId(request.getRelegationEnterpriseId());
//        entity.setManageEnterpriseId(request.getManageEnterpriseId());
//        entity.setStatus(BusinessEntityStatusDict.ENABLED);
//        entity.setManageEnterpriseId(request.getManageEnterpriseId());
//        entity.setRelegationEnterpriseId(request.getRelegationEnterpriseId());
//        entity.setBusinessType(request.getShopType());
//        entity.setChannelId(request.getChannelId());
//        entity.setLogo(request.getLogo());
//        entity.setDesc(request.getDesc());
//        entity.setOutCode(request.getOutCode());
//        entity.setMyIsOnShelfAudit(request.getMyIsOnShelfAudit());
//        entity.setOutCode(request.getOutCode());
//        entity.setStage(request.getStage());
//        entity.setParentEntityId(request.getParentEntityId());
//        entity.setLevel(request.getLevel());
//        entity.setIsLastStage(request.getIsSelfMention());
//        entity.setMobileCode(request.getMobileCode());
//        entity.setOnWorkTime(request.getOnWorkTime());
//        entity.setOffWorkTime(request.getOffWorkTime());
//
//        if (request.getCertificationAttributeParam() != null) {
//            CertificationAttributeParam attributeParam = request.getCertificationAttributeParam();
//            CertificationAttribute attribute = new CertificationAttribute();
//            attribute.setAccessToken(attributeParam.getAccessToken());
//            attribute.setAppKey(attributeParam.getAppKey());
//            attribute.setAppSecret(attributeParam.getAppSecret());
//            attribute.setGateWay(attributeParam.getGateWay());
//
//            entity.setCertificationAttribute(attribute);
//        }
//
//        if(Objects.nonNull(request.getUpdatedBy())){
//            User user = new User();
//            user.setId(Long.valueOf(request.getUpdatedBy()));
//            entity.setUpdatedBy(user);
//            entity.setCreatedBy(user);
//        }
//
//        return entity;
//    }
//
//    public static MDAddress constructUpdateAddress(MDAddress mdAddress, MDShopUpdateRequest request) {
//        mdAddress.setLongitude(request.getLongitude());
//        mdAddress.setLatitude(request.getLatitude());
//        mdAddress.setContactPhone(request.getContactPhone());
//        mdAddress.setContactName(request.getContactName());
//
//        //地址拆解
//        if (Objects.nonNull(request.getAddress())) {
//            Address address = request.getAddress();
//            Address.Area province = address.getProvince();
//            Address.Area city = address.getCity();
//            Address.Area region = address.getRegion();
//            Address.Area street = address.getStreet();
//            String detail = address.getDetail();
//            mdAddress.setProvinceId(province != null ? province.getId() : null);
//            mdAddress.setCityId(city != null ? city.getId() : null);
//            mdAddress.setDistrictId(region != null ? region.getId() : null);
//            mdAddress.setStreet(street != null ? street.getId() : null);
//            mdAddress.setAddressDetail(detail);
//            mdAddress.setAddress(address);
//        }
//
//        return mdAddress;
//    }
//
//    public static MDAddress constructAddress(MDShopCreateRequest request) {
//        MDAddress mdAddress = new MDAddress();
//        mdAddress.setContactName(request.getContactName());
//        mdAddress.setContactPhone(request.getContactPhone());
//        mdAddress.setLatitude(request.getLatitude());
//        mdAddress.setLongitude(request.getLongitude());
//        mdAddress.setOwnerType(AddressOwnerType.SHOP);
//
//        //地址拆解
//        if (Objects.nonNull(request.getAddress())) {
//            Address address = request.getAddress();
//            Address.Area province = address.getProvince();
//            Address.Area city = address.getCity();
//            Address.Area region = address.getRegion();
//            Address.Area street = address.getStreet();
//            String detail = address.getDetail();
//            mdAddress.setProvinceId(province != null ? province.getId() : null);
//            mdAddress.setCityId(city != null ? city.getId() : null);
//            mdAddress.setDistrictId(region != null ? region.getId() : null);
//            mdAddress.setStreet(street != null ? street.getId() : null);
//            mdAddress.setAddressDetail(detail);
//            mdAddress.setAddress(address);
//        }
//
//        return mdAddress;
//    }
}
