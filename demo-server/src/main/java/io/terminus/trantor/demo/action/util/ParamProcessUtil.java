/*
 * Copyright (c) 2020. 杭州端点网络科技有限公司.  All rights reserved.
 */

package io.terminus.trantor.demo.action.util;

import cn.hutool.core.util.ClassUtil;
import cn.hutool.core.util.ModifierUtil;
import cn.hutool.core.util.ReflectUtil;
import com.alibaba.fastjson.JSON;
import com.google.common.base.Throwables;
import io.terminus.api.request.AbstractPageRequest;
import io.terminus.api.request.AbstractRequest;
import io.terminus.trantor.api.annotation.RootModel;
import io.terminus.trantor.sdk.datasource.MultiDataParams;
import lombok.extern.slf4j.Slf4j;
import org.springframework.util.ReflectionUtils;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * @author lsk mailto:liushaokang@terminus.io
 * @create 2020-06-24 10:02 上午
 **/
@Slf4j
public class ParamProcessUtil {

    public static <REQUEST extends AbstractRequest> REQUEST dataParam2Object(MultiDataParams multiDataParams, Class<REQUEST> clazzRequest) {
        try {
            final AbstractRequest request = clazzRequest.newInstance();
            Map<String, Object> queryValues = multiDataParams.getSearchValues().flatten();
            Map<String, Object> extraMap = new HashMap<>(queryValues.size());
            extraMap.putAll(queryValues);
            Integer pageNo = multiDataParams.getPaging().getNo();
            Integer pageSize = multiDataParams.getPaging().getSize();
            if (request instanceof AbstractPageRequest) {
                AbstractPageRequest pageRequest = (AbstractPageRequest) request;
                pageRequest.setPageNo(pageNo);
                pageRequest.setPageSize(pageSize);
            }
            ReflectionUtils.doWithLocalFields(request.getClass(), field -> {
                if (!ModifierUtil.isStatic(field)) {
                    Object val = queryValues.get(field.getName());
                    if (Objects.nonNull(val)) {
                        ReflectUtil.setFieldValue(request, field, val);
                        extraMap.remove(field.getName());
                    }
                }
            });

            Map<String, String> extraFields = new HashMap<>();
            extraFields.put(RootModel.FIELDS, JSON.toJSONString(extraMap));
            request.setExtra(extraFields);
            return (REQUEST) request;
        } catch (Exception e) {
            log.error(" exchange happen error, cause:{}", Throwables.getStackTraceAsString(e));

            return null;
        }

    }
}
