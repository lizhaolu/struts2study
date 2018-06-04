package nuc.sw.validate;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import java.util.regex.Pattern;

/**
 * Created by superzhaolu on 2017/10/9.
 */
public class loginAction extends ActionSupport {
    //属性驱动接受数据
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
//    public void validate(){
//        if(username.trim().length()<6||username.trim().length()>15){
//            this.addFieldError("username","用户名长度不合法");
//        }
//        if(password.trim().length()<6||password.trim().length()>15){
//            this.addFieldError("password","密码长度不合法");
//        }
//    }
    //登录的业务逻辑处理
    public String loginMethod(){
        if(username.equals("lizhaolu")&&password.equals("123456789")){
            ActionContext.getContext().getSession().put("user",username);
            return "loginOK";
        }else{
            this.addFieldError("err","用户名或密码不正确");
            return "loginFail";
        }
    }
    //手动校验方法二
    public void validateLoginMethod(){
        //使用正则表达式
        if(username==null||username.trim().equals("")){
            this.addFieldError("username","用户名不可为空");
        }else{
            if(!Pattern.matches("\\w{6,15}",username.trim())){
                this.addFieldError("username","用户名格式错误");
            }
        }
        if(password==null||password.trim().equals("")){
            this.addFieldError("password","密码不可为空");
        }else{
            if(!Pattern.matches("\\w{6,15}",password.trim())){
                this.addFieldError("password","密码格式错误");
            }
        }
    }
}
