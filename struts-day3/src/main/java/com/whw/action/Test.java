package com.whw.action;


import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.Result;
import com.whw.bean.TestBean;
import org.apache.struts2.ServletActionContext;

import java.lang.reflect.Method;
import java.util.List;

public class Test implements Result{
    private String name;
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void execute(ActionInvocation actionInvocation) throws Exception {
        System.out.println(name);
        Object action = actionInvocation.getAction();
        Class<?> aClass = action.getClass();
        String s = "";
        try {
            Method method = aClass.getDeclaredMethod("getMessage");
             s = (String) method.invoke(action);
        } catch (NoSuchMethodException e) {

        } catch (SecurityException e) {

        }
        ServletActionContext.getResponse().getWriter().append(s);
    }
}
