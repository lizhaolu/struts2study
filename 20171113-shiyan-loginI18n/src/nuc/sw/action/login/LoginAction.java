package nuc.sw.action.login;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.ServletActionContext;

import java.util.regex.Pattern;

/**
 * Created by superzhaolu on 2017/11/14.
 */
public class LoginAction extends ActionSupport {
    //属性驱动调用属性
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
    //手动校验方法1
    @Override
    public void validate() {
        //进行数据校验，长度3～15位
        if (password == null || password.trim().equals("")) {
            this.addFieldError("password", this.getText("pass.required"));
        } else {
            if (password.trim().length() < 3 || password.trim().length() > 15 || password == null) {
                this.addFieldError("password", this.getText("passerror"));
            }
        }
    }
    //手动校验方法2
    public void validateLoginMethod() {
        //使用正则表达式校验
        if (username == null || username.trim().equals("")) {
            this.addFieldError("username", this.getText("user.required"));
        } else {
            if (!Pattern.matches("\\w{3,15}", username.trim())) {
                this.addFieldError("username", "usererror");
            }
        }
    }
    public String loginMethod() {
        //HttpSession session= ServletActionContext.getRequest().getSession();
        if (username.equals("lizhaolu") && password.equals("123456")) {
            ActionContext.getContext().getSession().put("user", username);
            return "loginOK";
        } else {
            this.addFieldError("err", this.getText("errorInfo"));
            return "input";
        }
    }
}
