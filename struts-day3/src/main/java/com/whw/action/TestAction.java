package com.whw.action;

import com.opensymphony.xwork2.ActionContext;

public class TestAction {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String t1(){
        System.out.println(name+"---->t1");
        age = 10;
        ActionContext.getContext().getSession().put("age",18);
        return "sos";
    }
    public void t2(){
        System.out.println(name+"---->t2");
    }
    public void t3(){
        System.out.println(name+"---->t2");
    }
    public String getMessage(){
        return "hello word";
    }
}
