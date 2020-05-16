package action;

import bean.User;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import org.apache.struts2.convention.annotation.*;
@ParentPackage("whw")
@Namespace("/")
public class UserAction extends ActionSupport implements ModelDriven<User>{
    private String like;
    private User user;
    private String pp;

    public void setPp(String pp) {
        this.pp = pp;
    }

    public void setLike(String like) {
        this.like = like;
    }
    @Action( value = "test2"
            ,interceptorRefs = {@InterceptorRef("my"),@InterceptorRef("defaultStack")},
            results = {@Result(name = "success",type = "myResult"
           , params = {"name","sss"}
            )}
            ,params = {"pp","pp2"}
    )
    public String test(){
        System.out.println(like);
        System.out.println(user.getId());
        System.out.println(user.getName());
        System.out.println(pp);
        return "success";
    }
    @Override
    public User getModel() {
        user = new User();
        return user;
    }
}
