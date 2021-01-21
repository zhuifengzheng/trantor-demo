package io.terminus.trantor.demo.manager.model;

import io.terminus.trantor.api.annotation.BaseModel;
import io.terminus.trantor.api.annotation.DeleteStrategy;
import io.terminus.trantor.api.annotation.TModel;
import io.terminus.trantor.api.annotation.TModelField;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @author <a href="yzl249497@alibaba-inc.com">yangzhilin</a>
 * @description:
 * @date Create on 2020/4/10
 * @since version1.0 Copyright 2020 terminus.io All Rights Reserved.
 */

@Data
@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
@TModel(name = "外部用户汽车", dbTableName = "md_car", deleteStrategy = DeleteStrategy.Physical)
public class MDCar extends BaseModel<Long> {


    @TModelField(name = "用户ID", dbColumnName = "user_id")
    private Long userId;

    /**
     * 品牌
     */
    @TModelField(name = "品牌", dbColumnName = "brand")
    private String brand;
    /**
     * 型号
     */
    @TModelField(name = "型号", dbColumnName = "model")
    private String model;

    /**
     * 年份
     */
    @TModelField(name = "年份", dbColumnName = "year")
    private Date year;

    /**
     * 购买时间
     */
    @TModelField(name = "购买时间", dbColumnName = "buy_date")
    private Date buyDate;

    /**
     * 续保时间
     */
    @TModelField(name = "续保时间", dbColumnName = "re_new_date")
    private Date reNewDate;


}
