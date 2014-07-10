package ua.khvorov.api.entity;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;

public class User implements Serializable {

    private String nickname;
    private String password;
    private String city;
    private Date dateOfBirth;
    private String info;

    private String logIn;
    private static final SimpleDateFormat SIMPLE_DATE_FORMAT = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    public User(String nickname, String password, String city, Date dateOfBirth, String info) {
        this.nickname = nickname;
        this.password = password;
        this.city = city;
        this.dateOfBirth = dateOfBirth;
        this.info = info;

        logIn = SIMPLE_DATE_FORMAT.format(System.currentTimeMillis());
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public String getLogIn() {
        return logIn;
    }

    public void setLogIn(String logIn) {
        this.logIn = logIn;
    }

    @Override
    public String toString() {
        return "User{" +
                "nickname='" + nickname + '\'' +
                ", password='" + password + '\'' +
                ", city='" + city + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", info='" + info + '\'' +
                ", logIn=" + logIn +
                '}';
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }

        if (!(object instanceof User)) {
            return false;
        }

        User user = (User) object;

        return nickname.equals(user.nickname) && password.equals(user.password);

    }

    @Override
    public int hashCode() {
        int hash = 37;

        hash = hash * 17 + nickname.hashCode();
        hash = hash * 17 + password.hashCode();
        hash = hash * 17 + city.hashCode();
        hash = hash * 17 + dateOfBirth.hashCode();
        hash = hash * 17 + info.hashCode();
        hash = hash * 17 + logIn.hashCode();

        return hash;
    }
}
