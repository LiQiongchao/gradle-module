package com.yupoop.module.bean;

import java.io.Serializable;

/**
 * @Author: Qiongchao
 * @Version: 1.0.0
 * @Date: 2023/12/20
 */
public class Admin  implements Serializable {
    private Integer id;
    private String username;
    private String email;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Admin{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
