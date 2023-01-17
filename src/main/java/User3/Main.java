package User3;

public class Main {
    public static void main(String[] args) {
        Users users = new Users();

       users.addUserArrayList("Malou", User.RoleEnum.ADMIN);
       users.addUserArrayList("Malou", User.RoleEnum.ADMIN);
       users.addUserArrayList("Malou", User.RoleEnum.ADMIN);
       users.addUserArrayList("Malou", User.RoleEnum.ADMIN);

       System.out.println(users.getUserArrayList());

    }
}
