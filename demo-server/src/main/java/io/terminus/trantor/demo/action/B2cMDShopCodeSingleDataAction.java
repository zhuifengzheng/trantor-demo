package io.terminus.trantor.demo.action;

import com.google.common.collect.Maps;
import io.terminus.trantor.api.annotation.type.Address;
import io.terminus.trantor.demo.model.b2c.B2cMDShopVO;
import io.terminus.trantor.demo.model.b2c.MDChannelVO;
import io.terminus.trantor.demo.model.b2c.MDEnterpriseVO;
import io.terminus.trantor.module.base.model.User;
import io.terminus.trantor.sdk.datasource.SingleDataAction;
import io.terminus.trantor.sdk.query.QueryValues;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;

/**
 * @Author by yuanpeng
 * @Date 2021/1/28
 */
public class B2cMDShopCodeSingleDataAction implements SingleDataAction<B2cMDShopVO> {
    @Override
    public B2cMDShopVO load(QueryValues queryValues) {
        B2cMDShopVO shopVO = new B2cMDShopVO();
        HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();

        String code = request.getParameter("code");
        if (null == code){
            shopVO.setGrantCode("222");
        }else {
            shopVO.setGrantCode(code);
        }
        return shopVO;
    }
}
