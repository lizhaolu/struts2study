package nuc.sw.action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import java.util.regex.Pattern;

/**
 * Created by superzhaolu on 2017/10/11.
 */
public class LoginAction extends ActionSupport {

    private String password;

    private String username;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password1) {
        this.password = password1;
    }


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    //定义常量
    private final String PASSWORD = "\\w{5,16}";
    private final String USERNAME = "[a-zA-Z]{6,15}";

    public void validateLoginMethod() {
        if (password == null || "".equals(password.trim())) {
            this.addFieldError("password", "密码不可为空");
        } else {
            if (!Pattern.matches(PASSWORD, password)) {
                this.addFieldError("password1", "密码的格式错误");
            }
        }
        if (username == null || "".equals(username.trim())) {
            this.addFieldError("username", "登录名不可为空");
        } else {
            if (!Pattern.matches(USERNAME, username.trim())) {
                this.addFieldError("username", "登录名格式错误");
            }
        }
    }

    public String loginMethod() {
        //ActionContext.getContext().getSession().put("username", username);
       //User user = (User) ActionContext.getContext().getSession().get("user");
        if (username.equals("lizhaolu") && password.equals("123456")) {
            ActionContext.getContext().getSession().put("user", username);
            return "loginOK";
        }else{
            this.addFieldError("err","用户名或密码不正确");
            return "fail";
        }
    }

}


