package nuc.sw.Action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import nuc.sw.vo.User;

import java.util.regex.Pattern;

/**
 * Created by superzhaolu on 2017/10/9.
 */
public class RegisterAction extends ActionSupport implements ModelDriven<User> {
    public User u = new User();
    @Override
    public User getModel() {
        return u;
    }

    public String registerMethod() {
        ActionContext.getContext().getSession().put("user", u);
        return "registerOK";
    }
}


