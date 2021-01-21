package io.terminus.trantor.demo.model.facade.response;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @Author: dingqiang
 * @Date: 2020/9/23 8:13 下午
 */
@Data
@ApiModel
@EqualsAndHashCode(callSuper = true)
public class MDEnterpriseSerAreaInfo extends MasterDataAbstractInfo {
    private static final long serialVersionUID = -3413985574303602616L;
    @ApiModelProperty("id")
    private Long id;


    @ApiModelProperty(name = "主体id")
    private Long enterpriseId;

    @ApiModelProperty(name = "目标类型")
    private String targetType;

    @ApiModelProperty(name = "目标id")
    private Long targetId;
}
