package User;

public class User {

    private String userName;
    private int userID;
    private RoleEnum role;


    public User(String userName, int userID, RoleEnum role){
        this.userName = userName;
        this.userID = userID;
        this.role = role;
    }

    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", userID=" + userID +
                ", role=" + role +
                '}';
    }
}
