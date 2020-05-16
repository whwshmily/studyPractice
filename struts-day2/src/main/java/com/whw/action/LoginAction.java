package com.whw.action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import org.apache.struts2.ServletActionContext;
import org.apache.struts2.dispatcher.SessionMap;

public class LoginAction {
    private int id;
   // private String name;
    private String like = "like";
    public String  execute(){
      //  System.out.println(id+"-------"+name);

        return "success";
    }

    public void setId(int id) {
        this.id = id;
    }

//    public void setName(String name) {
//        this.name = name;
//    }


    public int getId() {
        return id;
    }

    public String getLike() {
        return like;
    }

    public void setLike(String like) {
        this.like = like;
    }
}
