/*
 * Copyright (c) 2020. 杭州端点网络科技有限公司.  All rights reserved.
 */

package io.terminus.trantor.demo.action.converter;

import io.terminus.trantor.demo.model.b2c.MDEnterpriseVO;
import io.terminus.trantor.demo.model.facade.response.MDEnterpriseInfo;
import org.springframework.util.CollectionUtils;

import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

/**
 * @author lsk mailto:liushaokang@terminus.io
 * @create 2020-06-30 2:16 下午
 **/
public class MDEnterpriseConverter {

    public static MDEnterpriseVO converter(MDEnterpriseInfo enterpriseInfo) {
        if (Objects.isNull(enterpriseInfo)) {
            return null;
        }

        MDEnterpriseVO mDEnterpriseVO = new MDEnterpriseVO();
        mDEnterpriseVO.setCode(enterpriseInfo.getCode());
        mDEnterpriseVO.setOutCode(enterpriseInfo.getOutCode());
        mDEnterpriseVO.setName(enterpriseInfo.getName());
        mDEnterpriseVO.setNameUsedBefore(enterpriseInfo.getNameUsedBefore());
        mDEnterpriseVO.setShortName(enterpriseInfo.getShortName());
        mDEnterpriseVO.setType(enterpriseInfo.getType());
        mDEnterpriseVO.setTaxpayerType(enterpriseInfo.getTaxpayerType());
        mDEnterpriseVO.setUnifiedSocialCreditCode(enterpriseInfo.getUnifiedSocialCreditCode());
        mDEnterpriseVO.setLegalRepresentativeName(enterpriseInfo.getLegalRepresentativeName());
        mDEnterpriseVO.setCredentialsType(enterpriseInfo.getCredentialsType());
        mDEnterpriseVO.setLegalRepresentativeId(enterpriseInfo.getLegalRepresentativeId());
        mDEnterpriseVO.setCredentials(enterpriseInfo.getCredentials());
        mDEnterpriseVO.setLegalRepresentativeContact(enterpriseInfo.getLegalRepresentativeContact());
        mDEnterpriseVO.setEnterpriseType(enterpriseInfo.getEnterpriseType());
        mDEnterpriseVO.setRegisteredCapital(enterpriseInfo.getRegisteredCapital());
        mDEnterpriseVO.setBusinessStatus(enterpriseInfo.getBusinessStatus());
        mDEnterpriseVO.setFoundAt(enterpriseInfo.getFoundAt());
        mDEnterpriseVO.setBusinessBeginAt(enterpriseInfo.getBusinessBeginAt());
        mDEnterpriseVO.setBusinessEndAt(enterpriseInfo.getBusinessEndAt());
        mDEnterpriseVO.setCountry(enterpriseInfo.getCountry());
        mDEnterpriseVO.setAddress(enterpriseInfo.getAddress());
        mDEnterpriseVO.setAttachment(enterpriseInfo.getAttachment());
        mDEnterpriseVO.setBusinessScope(enterpriseInfo.getBusinessScope());
        mDEnterpriseVO.setWebsite(enterpriseInfo.getWebsite());
        mDEnterpriseVO.setCreatedAt(enterpriseInfo.getCreatedAt());
        mDEnterpriseVO.setUpdatedAt(enterpriseInfo.getUpdatedAt());
        mDEnterpriseVO.setCreatedBy(enterpriseInfo.getCreatedBy());
        mDEnterpriseVO.setUpdatedBy(enterpriseInfo.getUpdatedBy());
        mDEnterpriseVO.setId(enterpriseInfo.getId());
        mDEnterpriseVO.setUsePlatformOms(enterpriseInfo.getUsePlatformOms());
        mDEnterpriseVO.setUsePlatformTms(enterpriseInfo.getUsePlatformTms());
        mDEnterpriseVO.setUsePlatformWms(enterpriseInfo.getUsePlatformWms());

        mDEnterpriseVO.setTaxpayerCode(enterpriseInfo.getTaxpayerCode());
        mDEnterpriseVO.setBankName(enterpriseInfo.getBankName());
        mDEnterpriseVO.setBankType(enterpriseInfo.getBankType());
        mDEnterpriseVO.setCardNo(enterpriseInfo.getCardNo());
        mDEnterpriseVO.setIntroduction(enterpriseInfo.getIntroduction());
        mDEnterpriseVO.setCurrency(enterpriseInfo.getCurrency());
        mDEnterpriseVO.setStatus(enterpriseInfo.getStatus());
        mDEnterpriseVO.setInternalType(enterpriseInfo.getInternalType());

        if(Objects.nonNull(enterpriseInfo.getParent())){
            MDEnterpriseVO parent = new MDEnterpriseVO();
            parent.setId(enterpriseInfo.getParent().getId());
            parent.setName(enterpriseInfo.getParent().getName());
            mDEnterpriseVO.setParent(parent);
        }

        mDEnterpriseVO.setIndustry(enterpriseInfo.getIndustry());

        if (enterpriseInfo.getHasChildren() != null){
            mDEnterpriseVO.setIsLeaf(!enterpriseInfo.getHasChildren());
            mDEnterpriseVO.setHasChildren(enterpriseInfo.getHasChildren());
        }

        //todo 待确定是否需要补充完整
//        mDEnterpriseVO.setBanks();
//        mDEnterpriseVO.setContacts();
//        mDEnterpriseVO.setTaxItems();
//        mDEnterpriseVO.setUsers();
//        mDEnterpriseVO.setShareHolders();
        return mDEnterpriseVO;
    }
}
