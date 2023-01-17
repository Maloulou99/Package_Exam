package User2;

public class Main {

    public static void main(String[] args) {


        Users users = new Users();

        users.opretterBruger("Malou", RoleEnum.ADMIN);
        users.opretterBruger("Malou", RoleEnum.EDITOR);

        System.out.println(users.getUsers());
    }
}
