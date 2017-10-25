package com.kaishengit.entity;

/**
 * Created by 蔡林红 on 2017/10/24.
 */
public class Student {
    private  int id;
    private String className;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", className='" + className + '\'' +
                '}';
    }
}
