package com.whw.action;

import com.whw.bean.User;

public class Test2 {
    private User user;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public void execute(){
        System.out.println(user);
        //System.out.println(user.getId()+"----");
    }
}
