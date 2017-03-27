package com.wxx.greendao.bean;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Generated;

/**
 * 作者：Tangren_ on 2017/3/23 0023.
 * 邮箱：wu_tangren@163.com
 * TODO:
 */

@Entity
public class Info {

    @Id(autoincrement = true)
    private Long id;

    private String name;

    private int age;

    private String addRess;

    private String test;

    @Generated(hash = 1155217490)
    public Info(Long id, String name, int age, String addRess, String test) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.addRess = addRess;
        this.test = test;
    }

    @Generated(hash = 614508582)
    public Info() {
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddRess() {
        return this.addRess;
    }

    public void setAddRess(String addRess) {
        this.addRess = addRess;
    }

    public String getTest() {
        return this.test;
    }

    public void setTest(String test) {
        this.test = test;
    }

}
