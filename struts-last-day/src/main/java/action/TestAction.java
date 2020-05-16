package action;

import bean.User;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;

import java.util.ArrayList;
import java.util.List;

@ParentPackage("whw")
@Namespace("/")
public class TestAction extends ActionSupport {
    private String name;
    private int id;
    private User user;
    private List<User> list;

    public List<User> getList() {
        list = new ArrayList<>();
        for (int i = 0; i <10 ; i++) {
            list.add(new User("xiaoqiu"+i,i));
        }
        return list;
    }

    public void setList(List<User> list) {
        this.list = list;
    }

    @Action(value = "test"
    )
    public void test1(){
        System.out.println(name);
        System.out.println(id);
        System.out.println(user);
    }
    @Action(value = "test1")
    public void test2(){
        System.out.println(name);
        System.out.println(id);
        System.out.println(user);
        System.out.println(user.getName());
        System.out.println(user.getId());
    }
    @Action(value = "test3",
    results = {@Result(name = "sos",
    type = "dispatcher",location = "/index.jsp"
    )}
    )
    public String test3(){
        System.out.println(name);
        System.out.println(id);
        System.out.println(user);
        return "sos";
    }









    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public User getUser() {
        user = new User();
        return user;
    }

    public void setUser(User user) {

        this.user = user;
    }
}
