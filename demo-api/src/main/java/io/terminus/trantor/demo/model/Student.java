package io.terminus.trantor.demo.model;

import io.terminus.trantor.api.annotation.BaseModel;
import io.terminus.trantor.api.annotation.TModel;
import io.terminus.trantor.api.annotation.TModelField;
import lombok.Data;

/**
 * @Author by yuanpeng
 * @Date 2021/1/4
 */
@Data
@TModel(name = "学生信息")
public class Student extends BaseModel<Long> {
    private static final long serialVersionUID = 3091855884882369349L;

    @TModelField(name = "用户名", nullable = false)
    private String name;

    @TModelField(name = "年龄")
    private Integer age;

    @TModelField(name = "电话")
    private String phone;
}
