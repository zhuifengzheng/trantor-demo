package io.terminus.trantor.demo.address;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @Author by yuanpeng
 * @Date 2021/1/12
 */
@Data
public class AddressInfo implements Serializable {
    private static final long serialVersionUID = 6109961822129968488L;
    private List<Module> module;
}

@Data
class Module{
    private String id;//"R52299",
    private String name;//"Abra",
    private String nameLocal;//"Abra",
    private String parentId;//"R443174",
    private String displayName;//"Abra"
}
