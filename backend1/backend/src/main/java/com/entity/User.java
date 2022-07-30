package com.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User {
    @Id
    private String email;
    private String name;
    private String password;
    @Id
    private long mobile_no;

    public User() {
    }

    public User(String email, String name, String password, long mobile_no) {
        this.email = email;
        this.name = name;
        this.password = password;
        this.mobile_no = mobile_no;
    }

    public long getMobile_no() {
        return mobile_no;
    }

    public void setMobile_no(long mobile_no) {
        this.mobile_no = mobile_no;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "user{" +
                "email='" + email + '\'' +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", mobile_no=" + mobile_no +
                '}';
    }
}
