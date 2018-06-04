package nuc.sw.vo;

/**
 * Created by superzhaolu on 2017/10/16.
 */
public class User {
    private String username;
    private Tel tel;
    private Address adress;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Tel getTel() {
        return tel;
    }

    public void setTel(Tel tel) {
        this.tel = tel;
    }

    public Address getAdress() {
        return adress;
    }

    public void setAdress(Address adress) {
        this.adress = adress;
    }
}
