package com.whw.action;

import com.whw.bean.User;

public class Test4 {
    private int id;
    private String name;
    private User user;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
    public void execute(){
        System.out.println(user.getId()+"----");
        System.out.println(id+"----"+name);
    }
}
