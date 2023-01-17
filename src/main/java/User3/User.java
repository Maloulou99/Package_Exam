package User3;

import javax.management.relation.Role;

public class User {
    private String userName;
    private  int userId;
    private RoleEnum role;


    public enum RoleEnum{
        ADMIN,
        EDITOR,
        READER,
    }

    public User(String userName, int userId, RoleEnum role) {
        this.userName = userName;
        this.userId = userId;
        this.role = role;
    }

    public String getUserName() {
        return userName;
    }

    public int getUserId() {
        return userId;
    }

    public RoleEnum getRole() {
        return role;
    }

    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", userId=" + userId +
                '}';
    }
}
