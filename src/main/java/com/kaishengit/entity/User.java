package com.kaishengit.entity;

/**
 * Created by 蔡林红 on 2017/10/22.
 */
public class User {
    private  int id;
    private  String name;
    private  int age;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;

    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    @Override
     public String toString() {
        return "User [id=" + id + ", name=" + name + ", age=" + age + "]";
    }

}

