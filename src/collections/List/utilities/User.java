package collections.List.utilities;

import java.util.Objects;

public class User {
    String username;
    String password;

    public User(){}

    public String getUsername() {
        return username;
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj) return true;
        if(obj==null || getClass()!= obj.getClass()) return false;
        User user = (User) obj;
        return Objects.equals(username,user.username) && Objects.equals(password,user.password);
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


}
