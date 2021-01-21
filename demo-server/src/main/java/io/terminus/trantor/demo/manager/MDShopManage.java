/*
 * Copyright (c) 2020. 杭州端点网络科技有限公司.  All rights reserved.
 */

package io.terminus.trantor.demo.manager;

import io.terminus.common.exception.ServiceException;
import io.terminus.common.model.Paging;
import io.terminus.trantor.api.annotation.RootModel;
import io.terminus.trantor.demo.action.converter.MDShopConverter;
import io.terminus.trantor.demo.manager.model.MDAddress;
import io.terminus.trantor.demo.manager.model.MDChannel;
import io.terminus.trantor.demo.manager.model.MDEnterprise;
import io.terminus.trantor.demo.model.b2c.MDBusinessEntity;
import io.terminus.trantor.demo.model.facade.request.MDShopPageRequest;
import io.terminus.trantor.demo.model.facade.response.MDShopFullInfo;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @author lsk mailto:liushaokang@terminus.io
 * @create 2020-06-16 2:48 下午
 **/
@Slf4j
@Service
@RequiredArgsConstructor
public class MDShopManage {
//    private final MDBusinessEntityService entityService;
//    private final MDEnterpriseService enterpriseService;
//    private final MDAddressService mdAddressService;
//    private final MDChannelService channelService;
//    private final MDBusinessEntityManage businessEntityManage;

    public Paging<MDShopFullInfo> page(MDShopPageRequest request) {
//        Paging<MDBusinessEntity> paging = businessEntityManage.page(request.getPageNo(), request.getPageSize(), MDShopConverter.converter(request));
//        if (paging.isEmpty()) {
            return  new Paging(10L, new ArrayList());

//        }

    }
//        List<MDShopFullInfo> shopFullInfos = paging.getData().stream().map(this::constructFullInfo).collect(Collectors.toList());
//
//        return new Paging<>(paging.getTotal(), shopFullInfos);
//    }
//
////    public List<MDShopFullInfo> findByRelegationEnterpriseId(Long relegationEnterpriseId) {
////        List<MDBusinessEntity> entities = entityService.findByRelegationEnterpriseId(relegationEnterpriseId, BusinessEntityTypeDict.SHOP);
////        if (CollectionUtils.isEmpty(entities)) {
////            return Collections.emptyList();
////        }
////
////        List<MDShopFullInfo> shopFullInfos = entities.stream().map(it -> constructFullInfo(it)).collect(Collectors.toList());
////        return shopFullInfos;
////    }
////
////
////    public List<MDShopFullInfo> findAll(){
////        List<MDBusinessEntity> entities = entityService.findAll();
////        if (CollectionUtils.isEmpty(entities)) {
////            return Collections.emptyList();
////        }
////        return entities.stream().map(this::constructFullInfo).collect(Collectors.toList());
////    }
////
////
////    public List<MDShopFullInfo> findByChannelId(Long channelId) {
////        List<MDBusinessEntity> entities = entityService.findByChannelId(channelId);
////        if (CollectionUtils.isEmpty(entities)) {
////            return Collections.emptyList();
////        }
////
////        List<MDShopFullInfo> shopFullInfos = entities.stream().map(it -> constructFullInfo(it)).collect(Collectors.toList());
////        return shopFullInfos;
////    }
////
////    public Long create(MDShopCreateRequest request) {
////        Long relegationEnterpriseId = request.getRelegationEnterpriseId();
////        if (!CollectionUtils.isEmpty(entityService.findByRelegationEnterpriseId(relegationEnterpriseId, BusinessEntityTypeDict.SHOP))) {
////            throw new ServiceException(MDShopErrorCode.ENTERPRISE_SHOP_HAS_EXIST);
////        }
////
////        Long channelId = request.getChannelId();
////        if (Objects.nonNull(channelId)) {
////            MDChannel channel = channelService.findById(channelId);
////            if (Objects.isNull(channel)) {
////                throw new ServiceException(MDShopErrorCode.SHOP_RELATED_CHANNEL_NOT_FOUND);
////            }
////
////            Boolean isExternal = ChannelManageTypeDict.EXTERNAL.equalsIgnoreCase(channel.getManageType());
////            if (isExternal) {
////                if (StringUtils.isEmpty(request.getOutCode())) {
////                    throw new ServiceException(MDShopErrorCode.SHOP_RELATED_OUT_CODE_NOT_FOUND);
////                }
////                Boolean exist = entityService.checkOutCodeExist(channelId, request.getOutCode(), BusinessEntityTypeDict.SHOP);
////                if (exist) {
////                    throw new ServiceException(MDShopErrorCode.SHOP_OUT_CODE_DUPLICATE);
////                }
////            }
////        }
////
////        MDBusinessEntity entity = MDShopConverter.converter(request);
////        entity.setType(BusinessEntityTypeDict.SHOP);
////
////        MDAddress address = MDShopConverter.constructAddress(request);
////
////        return businessEntityManage.create(entity, address);
////    }
////
////    public Boolean update(MDShopUpdateRequest request) {
////        Long shopId = request.getId();
////        MDBusinessEntity existed = businessEntityManage.findById(shopId);
////        if (Objects.isNull(existed)) {
////            throw new ServiceException(MDShopErrorCode.SHOP_NOT_FOUND);
////        }
////
////        Long relegationEnterpriseId = request.getRelegationEnterpriseId();
////        List<MDBusinessEntity> shops = entityService.findByRelegationEnterpriseId(relegationEnterpriseId, BusinessEntityTypeDict.SHOP);
////        if (!CollectionUtils.isEmpty(shops)) {
////            List<Long> shopIds = shops.stream().map(RootModel::getId).collect(Collectors.toList());
////            if (!shopIds.contains(shopId)) {
////                throw new ServiceException(MDShopErrorCode.ENTERPRISE_SHOP_HAS_EXIST);
////            }
////        }
////
////        MDBusinessEntity entity = MDShopConverter.converter(request);
////        entity.setCode(existed.getCode());
////        entity.setSimpleCode(existed.getSimpleCode());
////        MDAddress toUpdate = null;
////        List<MDAddress> addresses = mdAddressService.findByOwner(existed.getId(), existed.getType());
////        if (!CollectionUtils.isEmpty(addresses)) {
////            MDAddress address = addresses.get(0);
////
////            toUpdate = MDShopConverter.constructUpdateAddress(address, request);
////        }
////
////        return businessEntityManage.updateWithNull(entity, toUpdate);
////    }
////
////    public Paging<MDShopFullInfo> page(MDShopPageRequest request) {
////        Paging<MDBusinessEntity> paging = businessEntityManage.page(request.getPageNo(), request.getPageSize(), MDShopConverter.converter(request));
////        if (paging.isEmpty()) {
////            return Paging.empty();
////        }
////
////        List<MDShopFullInfo> shopFullInfos = paging.getData().stream().map(this::constructFullInfo).collect(Collectors.toList());
////
////        return new Paging<>(paging.getTotal(), shopFullInfos);
////    }
////
////    public MDShopFullInfo findById(Long id) {
////        final MDBusinessEntity entity = businessEntityManage.findById(id);
////        if (Objects.isNull(entity)) {
////            return null;
////        }
////
////        return constructFullInfo(entity);
////    }
////
////    public List<MDShopThinInfo> findByIds(Set<Long> ids) {
////        final List<MDBusinessEntity> shops = businessEntityManage.findByIds(ids);
////        if (CollectionUtils.isEmpty(shops)) {
////            return Collections.emptyList();
////        }
////
////        return shops.stream().map(it -> {
////            MDShopThinInfo shop = new MDShopThinInfo();
////            shop.setId(it.getId());
////            shop.setName(it.getName());
////            shop.setCode(it.getCode());
////            shop.setShopType(it.getBusinessType());
////            shop.setCertificationAttribute(MDShopConverter.converter(it.getCertificationAttribute()));
////            shop.setCreatedAt(it.getCreatedAt());
////            shop.setUpdatedAt(it.getUpdatedAt());
////            shop.setCreatedBy(it.getCreatedBy());
////            shop.setUpdatedBy(it.getUpdatedBy());
////
////            List<MDAddress> addresses = mdAddressService.findByOwner(it.getId(), AddressOwnerType.SHOP);
////            if (!CollectionUtils.isEmpty(addresses)) {
////                MDAddress mdAddress = addresses.get(0);
////                shop.setLongitude(mdAddress.getLongitude());
////                shop.setLatitude(mdAddress.getLatitude());
////            }
////
////            Long enterpriseId = it.getRelegationEnterpriseId();
////            if (Objects.nonNull(enterpriseId)) {
////                MDEnterprise enterprise = enterpriseService.findById(enterpriseId);
////                if (enterprise != null) {
////                    MDEnterpriseThinInfo enterpriseThinInfo = new MDEnterpriseThinInfo();
////                    enterpriseThinInfo.setId(enterprise.getId());
////                    enterpriseThinInfo.setCode(enterprise.getCode());
////                    enterpriseThinInfo.setOutCode(enterprise.getOutCode());
////                    enterpriseThinInfo.setName(enterprise.getName());
////                    enterpriseThinInfo.setNameUsedBefore(enterprise.getNameUsedBefore());
////                    enterpriseThinInfo.setShortName(enterprise.getShortName());
////                    enterpriseThinInfo.setType(enterprise.getType());
////
////                    shop.setEnterpriseThinInfo(enterpriseThinInfo);
////                }
////            }
////
////            if (Objects.nonNull(it.getChannelId())) {
////                Long channelId = it.getChannelId();
////                MDChannel mdChannel = channelService.findById(channelId);
////                MDChannelInfo mdChannelInfo = new MDChannelInfo();
////                mdChannelInfo.setId(mdChannel.getId());
////                mdChannelInfo.setCode(mdChannel.getCode());
////                mdChannelInfo.setName(mdChannel.getName());
////                mdChannelInfo.setClassification(mdChannel.getClassification());
////                mdChannelInfo.setDesc(mdChannel.getDesc());
////                mdChannelInfo.setManageType(mdChannel.getManageType());
////                mdChannelInfo.setStatus(mdChannel.getStatus());
////                mdChannelInfo.setType(mdChannel.getType());
////                shop.setChannelInfo(mdChannelInfo);
////            }
////            return shop;
////        }).collect(Collectors.toList());
////    }
////
//    private MDShopFullInfo constructFullInfo(MDBusinessEntity entity) {
//        MDAddress mdAddress = null;
//        MDEnterprise relegationEnterprise = null;
//        MDEnterprise manageEnterprise = null;
//        MDChannel channel = null;
//        Long relegationEnterpriseId = entity.getRelegationEnterpriseId();
//        if (relegationEnterpriseId != null) {
//            relegationEnterprise = enterpriseService.findById(relegationEnterpriseId);
//        }
//        Long manageEnterpriseId = entity.getManageEnterpriseId();
//        if (manageEnterpriseId != null) {
//            manageEnterprise = enterpriseService.findById(manageEnterpriseId);
//        }
//        Long channelId = entity.getChannelId();
//        if (channelId != null) {
//            channel = channelService.findById(channelId);
//        }
//        List<MDAddress> addresses = mdAddressService.findByOwner(entity.getId(), AddressOwnerType.SHOP);
//        if (!CollectionUtils.isEmpty(addresses)) {
//            mdAddress = addresses.get(0);
//        }
//        MDBusinessEntity parentEntity = null;
//        Long parentEntityId = entity.getParentEntityId();
//        if (parentEntityId != null) {
//            parentEntity = businessEntityManage.findById(parentEntityId);
//        }
//
//        return MDShopConverter.converterShopFullInfo(entity, mdAddress, relegationEnterprise, manageEnterprise, channel, parentEntity);
//    }

}
