/*
 * Copyright (c) 2020. 杭州端点网络科技有限公司.  All rights reserved.
 */

package io.terminus.trantor.demo.model.b2c;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author lsk mailto:liushaokang@terminus.io
 * @create 2020-06-15 4:11 下午
 **/
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CertificationAttribute implements Serializable {
    private static final long serialVersionUID = -3440973217076284520L;

    private String accessToken;

    private String appKey;

    private String appSecret;

    private String gateWay;
}
