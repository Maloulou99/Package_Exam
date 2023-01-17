package User2;

import java.util.ArrayList;
import java.util.List;

public class Users {

    private int userId = 0;
    private ArrayList<User> users = new ArrayList<>();


    public void opretterBruger(String userName, RoleEnum roleEnum){
        users.add(new User(userName, userId, roleEnum));
        userId++;

    }

    public ArrayList<User> getUsers(){
        return users;
    }

}
