package ua.khvorov.api.util;

import java.io.Serializable;

public class NickAndPassword implements Serializable {
    private String nickname;
    private String password;

    public NickAndPassword(String nickname, String password) {
        this.nickname = nickname;
        this.password = password;
    }

    public String getNickname() {
        return nickname;
    }

    public String getPassword() {
        return password;
    }

    @Override
    public String toString() {
        return "NicknameAndPassword{" +
                "nickname='" + nickname + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
