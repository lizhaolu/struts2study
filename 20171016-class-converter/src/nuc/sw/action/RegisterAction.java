package nuc.sw.action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import nuc.sw.vo.User;

/**
 * Created by superzhaolu on 2017/10/16.
 */
public class RegisterAction extends ActionSupport implements ModelDriven<User> {
    public User u=new User();

    public User getU() {
        return u;
    }

    public void setU(User u) {
        this.u = u;
    }

    @Override
    public User getModel(){
        return u;
    }

    public String registerMethod(){
        ActionContext.getContext().getSession().put("user",u);
        return "registerOK";
    }
}
