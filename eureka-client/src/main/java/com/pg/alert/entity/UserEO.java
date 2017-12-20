package com.pg.alert.entity;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * @Author: XieHaijun
 * @Description:
 * @Date: Created in 16:52 2017/12/19
 * @Modified By
 */
@Entity
@Table(name="T_USER")
public class UserEO implements Serializable{

    private static final long serialVersionUID = 4656900527634812392L;

    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "NAME", columnDefinition="varchar(128) not null",unique=true)//unique属性表示该字段是否为唯一标识，默认为false。 nullable属性表示该字段是否可以为null值，默认为true。
    private String name;

    @Column(name = "AGE" ,nullable=true )
    private String age;

    @Column(name = "CTEATE_DATE" ,insertable=true) //insertable属性表示在使用“INSERT”脚本插入数据时，是否需要插入该字段的值。
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date createDate;

    @Column(name = "UPDATE_DATE" ,updatable=true)
    private Date updateDate;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

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

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }
}
