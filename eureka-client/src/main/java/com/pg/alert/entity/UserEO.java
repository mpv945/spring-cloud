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
    /*当一个父类实现序列化，子类自动实现序列化，不需要显式实现Serializable接口。
    一个子类实现了 Serializable 接口，它的父类都没有实现 Serializable 接口，要想将父类对象也序列化，就需要让父类也实现Serializable 接口。*/
    /*@transient修饰的 变量的值被设为初始值，如 int 型的是 0，对象型的是 null。（不会被序列化），远程传输序列化类时，serialVersionUID要一样，可以全部使用1L*/
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

    // 在MySQL中没有Clob，用Text代替了，而且分为了tinytext， text，mediumtext，longtext。Blob也按这种方式分成了四种。
    // 可以通过@Column(columnDefinition = "mediumtext")这样的方式实现。
    //TinyText/Blob 对应 oracle clob字符和Blob字节
    // mysql （TinyText 255<Text 65535<MediumText<16777215 <LongText 4294967295
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
