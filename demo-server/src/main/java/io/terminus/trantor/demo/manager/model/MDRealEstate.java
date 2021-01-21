package io.terminus.trantor.demo.manager.model;

import io.terminus.trantor.api.annotation.BaseModel;
import io.terminus.trantor.api.annotation.DeleteStrategy;
import io.terminus.trantor.api.annotation.TModel;
import io.terminus.trantor.api.annotation.TModelField;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @author <a href="yzl249497@alibaba-inc.com">yangzhilin</a>
 * @description:
 * @date Create on 2020/4/10
 * @since version1.0 Copyright 2020 terminus.io All Rights Reserved.
 */
@AllArgsConstructor
@NoArgsConstructor
@TModel(name = "外部用户房产", dbTableName = "md_real_estate", deleteStrategy = DeleteStrategy.Physical)
public class MDRealEstate extends BaseModel<Long> {


    /**
     * 关联用户
     */
    @TModelField(name = "用户ID", dbColumnName = "user_id")
    private Long userId;

    /**
     * 所在城市
     */
    @TModelField(name = "所在城市", dbColumnName = "city")
    private String city;
    /**
     * 楼盘名称
     */
    @TModelField(name = "楼盘名称", dbColumnName = "property_name")
    private String propertyName;
    /**
     * 楼盘面积
     */
    @TModelField(name = "楼盘面积", dbColumnName = "property_area")
    private Integer propertyArea;

    /**
     * 购买时间
     */
    @TModelField(name = "购买时间", dbColumnName = "buyer_year")
    private Date buyYear;


}
