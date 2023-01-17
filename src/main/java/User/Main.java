package User;

public class Main {

    public static void main(String[] args) {
        Users users = new Users();

        users.opretterBruger("Rasmus", RoleEnum.ADMIN);
        users.opretterBruger("Rasmus", RoleEnum.ADMIN);
        users.opretterBruger("Rasmus", RoleEnum.ADMIN);

        System.out.println(users.getUsers());

    }
}
