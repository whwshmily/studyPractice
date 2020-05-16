package com.whw.action;

import com.opensymphony.xwork2.ModelDriven;
import com.whw.bean.User;

public class Test3 implements ModelDriven<User> {

    @Override
    public User getModel() {
        return user;
    }
    private User user = new User();
    public void execute(){
        System.out.println(user.getId()+"----");
       // System.out.println(id+"-----"+name);
    }
}
