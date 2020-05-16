package com.whw.interceptor;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;
import com.opensymphony.xwork2.interceptor.MethodFilterInterceptor;
import org.apache.struts2.ServletActionContext;

public class MyInterceptor extends MethodFilterInterceptor {
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    @Override
    protected String doIntercept(ActionInvocation actionInvocation) throws Exception {
        System.out.println("要想从这过，留下买路钱");
        System.out.println(name+"-------------1");
        String r = actionInvocation.invoke();
      //  ServletActionContext.getResponse().getWriter().append(" hello interceptor");
        System.out.println(name+"-------------2");
        return r;
    }
}
