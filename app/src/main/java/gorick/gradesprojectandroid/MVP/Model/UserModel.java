package gorick.gradesprojectandroid.MVP.Model;

/**
 * Created by sg-0036936 on 06/03/2017.
 */

public class UserModel {

    private String ra;
    private String name;
    private String password;

    public UserModel(String ra, String name, String password) {
        this.ra = ra;
        this.name = name;
        this.password = password;
    }

    public String getRa() {
        return ra;
    }

    public void setRa(String ra) {
        this.ra = ra;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
