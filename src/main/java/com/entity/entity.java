package com.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class entity {
    @Id
    private String email;
    private String name;
    private long mobile_no;
    private String password;

    public entity() {
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getMobile_no() {
        return mobile_no;
    }

    public void setMobile_no(long mobile_no) {
        this.mobile_no = mobile_no;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public entity(String email, String name, long mobile_no, String password) {
        this.email = email;
        this.name = name;
        this.mobile_no = mobile_no;
        this.password = password;
    }

    @Override
    public String toString() {
        return "entity{" +
                "email='" + email + '\'' +
                ", name='" + name + '\'' +
                ", mobile_no=" + mobile_no +
                ", password='" + password + '\'' +
                '}';
    }
}
