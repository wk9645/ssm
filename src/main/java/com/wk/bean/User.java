package com.wk.bean;

import java.util.Date;

public class User {

    private Integer id;
    private String name;
    private String password;
    private Integer gender;
    private Date birthday;

    public User() {}

    public User(Integer id, String name, String password, Integer gender, Date birthday) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.gender = gender;
        this.birthday = birthday;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", gender=" + gender +
                ", birthday=" + birthday +
                '}';
    }
}
