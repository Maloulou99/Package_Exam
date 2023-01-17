package User;

import java.util.ArrayList;

public class Users {

    private int id = 0;
    private ArrayList<User> users = new ArrayList<>();

    public void opretterBruger(String name, RoleEnum roleEnum){
        users.add(new User(name, id, roleEnum));
        id++;
    }

    public ArrayList<User> getUsers() {
        return users;
    }
}
