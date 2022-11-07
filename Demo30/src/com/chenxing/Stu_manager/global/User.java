package com.chenxing.Stu_manager.global;

/**
 * @ClassName User
 * @Description: TODO
 * @Author: lichenxingbeijing@163.com
 * @date ：Created in 07/10/2022 14:26
 */
public class User {
    // 保留
    private int id;
    private String username;
    private String password;
    private String permission;
    /**
     * 0-超级管理用户 增删改查
     * 1-普通管理员  增查
     * 2-普通用户    查询
     */

    // 构造方法
    public User(int id, String username, String password, String permission) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.permission = permission;
    }
    public User(String username, String password, String permission) {
        this.username = username;
        this.password = password;
        this.permission = permission;
    }

    public User() {
    }

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    // set get 方法


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPermission() {
        return permission;
    }

    public void setPermission(String permission) {
        this.permission = permission;
    }
    // toString 方法
    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", permission='" + permission + '\'' +
                '}';
    }
}
