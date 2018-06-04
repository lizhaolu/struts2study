package nuc.sw.action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

/**
 * Created by superzhaolu on 2017/9/26.
 */
public class Action extends ActionSupport {
    private String username;
    private String password;
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    //重写validate
    @Override
    public void validate(){
        if(username==null||username.trim().equals("")){
            this.addFieldError("usernameError","用户名不可为空");
        }
        if(password==null||password.trim().equals("")){
            this.addFieldError("passwordError","密码不可为空");
        }
    }
    public String loginMethod(){
        String code = (String) ActionContext.getContext().getSession().get("checkCode");

        if (username.equals("李昭璐")&&password.equals("123456") ) {
            ActionContext.getContext().getSession().put("username", username);
            return SUCCESS;
        }else {
            ActionContext.getContext().put("error","用户名或密码错误或验证码错误");
            return ERROR;

    }
    }
    private String info;

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public String registMethod(){
        info="请使用注册的用户名和密码登录";
        System.out.println("注册成功");
        return "registOK";
    }
}
