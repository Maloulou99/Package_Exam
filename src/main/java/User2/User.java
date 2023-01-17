package User2;

public class User {

    private String userName;
    private int userId;
    private RoleEnum role;


    public User(String userName, int userId, RoleEnum role){
        this.userName = userName;
        this.userId = userId;
        this.role = role;

    }

    public String toString(){
        return userName + " " + userId + " " + role;
    }

}
