package User3;

import javax.management.relation.Role;
import java.util.ArrayList;

public class Users {

    int id = 0;
    ArrayList<User> userArrayList = new ArrayList<>();

    public void addUserArrayList(String name, User.RoleEnum roleEnum) {
        userArrayList.add(new User(name, id, roleEnum));
        id++;
    }

    public ArrayList<User> getUserArrayList(){
        return userArrayList;
    }

    @Override
    public String toString() {
        return "Users{" +
                "userArrayList=" + userArrayList +
                '}';
    }
}
