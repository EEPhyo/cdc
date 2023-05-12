package com.ai.model;

import java.io.Serializable;

public class Role implements Serializable{
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getRole_name() {
        return role_name;
    }
    public void setRole_name(String role_name) {
        this.role_name = role_name;
    }
    private int id;
    private String role_name;

   

}
