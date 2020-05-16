package com.whw.action;

import com.opensymphony.xwork2.ActionContext;
import com.whw.bean.TestBean;
import com.whw.test.Test3;
import org.apache.struts2.ServletActionContext;

import javax.sound.midi.VoiceStatus;
import java.util.ArrayList;
import java.util.List;

public class Test2 extends Test3{
    private String name;
    private List<TestBean> list ;

    public String getName() {
        return name;
    }

    public List<TestBean> getList() {
        return list;
    }

    public void setList(List<TestBean> list) {
        this.list = list;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String  execute(){
        System.out.println("找到我了"+name);
        ActionContext.getContext().get("");
        ServletActionContext.getResponse();
        list =new ArrayList<>();
        for (int i = 0; i <10 ; i++) {
            list.add(new TestBean("xiaoqiu"+i,"awei"+i));
        }
        System.out.println(list);
        return "json";
    }



}
