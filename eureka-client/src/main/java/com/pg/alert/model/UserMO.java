package com.pg.alert.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * @Author: XieHaijun
 * @Description:
 * @Date: Created in 16:53 2017/12/19
 * @Modified By
 */
@ApiModel(description= "用户信息模型数据")
public class UserMO {

    @ApiModelProperty(value = "用户行命",name="name")
    private String name;

    @ApiModelProperty(value = "用户年龄",name="age")
    private String age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}
