package com.ssm.demo.entity;

import lombok.Data;

/**
 * 2019/11/23
 * author:ljh
 */
@Data
public class Person {
    private long id;
    private String name;
    private String email;
    private int status;

    //getter  setter

    @Override
    public String toString(){
        return this.getId()+"---"+this.getName()+"---"+
                this.getEmail()+"---"+this.getStatus();
    }
}
