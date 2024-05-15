package com.darkcode.spring.app.domain;

import lombok.Data;

@Data
public class Employee {
    private String fullname;
    private String user_email;

    public void setFullname(String fullname){
        this.fullname = fullname;
    }

    public void setUser_name(String user_email){
        this.user_email = user_email;
    }
}
