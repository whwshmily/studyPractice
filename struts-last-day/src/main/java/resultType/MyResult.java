package resultType;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.Result;
import org.apache.struts2.ServletActionContext;

public class MyResult implements Result {
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void execute(ActionInvocation actionInvocation) throws Exception {
        System.out.println(name);
        System.out.println("你来了");
        actionInvocation.getAction();
        ServletActionContext.getResponse().getWriter().append("hello  welcome to china");

    }
}
