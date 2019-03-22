package com.hx.swagger02.bean;

/**
 * Created by Minghua Chen on 2019/03/22.
 * add jxust-nc
 */
public class User {

    private String id;
    private String username;
    private String pwd;

    public User() {
    }

    public User(String id, String username, String pwd) {
        this.id = id;
        this.username = username;
        this.pwd = pwd;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }
}
