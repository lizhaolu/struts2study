package nuc.sw.vo;

import java.util.Date;

/**
 * Created by superzhaolu on 2017/11/14.
 */
public class User {
    private String email;
    private String password;
    private String comfrim;
    private String username;
    private Date birth;
    private String phone;
    private String code;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getComfrim() {
        return comfrim;
    }

    public void setComfrim(String comfrim) {
        this.comfrim = comfrim;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
