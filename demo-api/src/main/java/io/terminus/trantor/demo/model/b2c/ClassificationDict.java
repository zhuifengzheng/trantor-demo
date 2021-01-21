/*
 * Copyright (c) 2020. 杭州端点网络科技有限公司.  All rights reserved.
 */

package io.terminus.trantor.demo.model.b2c;

import io.terminus.trantor.api.annotation.TDict;
import io.terminus.trantor.api.annotation.typemeta.Label;

/**
 * @author lsk mailto:liushaokang@terminus.io
 * @create 2020-07-06 3:12 下午
 **/
@TDict(name = "渠道分类")
public class ClassificationDict {

    @Label("宣传渠道")
    public static final String propaganda = "propaganda";

    @Label("交易渠道")
    public static final String transaction = "transaction";

    @Label("物流渠道")
    public static final String logistics = "logistics";


}
