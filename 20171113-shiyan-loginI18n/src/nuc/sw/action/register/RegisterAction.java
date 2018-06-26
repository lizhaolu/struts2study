package nuc.sw.action.register;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import nuc.sw.vo.User;

import java.util.Map;

/**
 * Created by superzhaolu on 2017/11/14.
 */
public class RegisterAction extends ActionSupport implements ModelDriven<User> {
    private User u=new User();
    @Override
    public User getModel(){
        return u;
    }
    private ActionContext context=ActionContext.getContext();
    private Map<String,Object> session=context.getSession();
    private String code1= (String) session.get("code");
    public void validateRegistMethod() {
        //校验码  使用正则表达式校验
        if (u.getCode() == null || u.getCode().trim().equals("")) {
            this.addFieldError("code", "验证码不能为空！");
        } else {
            if (!code1.toLowerCase().equals(u.getCode().toLowerCase())) {
                System.out.println(code1 + "            " + u.getCode());
                this.addFieldError("codeError", "验证码错误");
            }
        }
    }
    //注册逻辑
    public String RegistMethod(){
        ActionContext.getContext().getSession().put("user",u);
        ActionContext.getContext().getSession().put("username",u.getUsername());
        ActionContext.getContext().getSession().put("password",u.getPassword());
        return "registOK";
    }

}
