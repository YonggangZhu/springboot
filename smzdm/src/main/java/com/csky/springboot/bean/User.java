package com.csky.springboot.bean;

public class User {
    int id;
    String name;
    String password;
    String email;
    String headUrl;

    public User(){}

    public User(int id, String name, String password, String email, String headUrl) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.email = email;
        this.headUrl = headUrl;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getHeadUrl() {
        return headUrl;
    }

    public void setHeadUrl(String headUrl) {
        this.headUrl = headUrl;
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", headUrl='" + headUrl + '\'' +
                '}';
    }
}
