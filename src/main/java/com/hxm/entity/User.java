package com.hxm.entity;

/**
 * @author XAIOHU
 * @date 2019/10/30 --14:18
 **/
public class User {
    private String name;
    private String age;
    private Integer id;

    public User() {
    }

    public User(String name, String age, Integer id) {
        this.name = name;
        this.age = age;
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

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
