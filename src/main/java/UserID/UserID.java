package UserID;

import java.util.Random;

public class UserID {

    private String userID;

    public boolean validUserID(String userID) {
        if (userID.length() != 8) {
            return false;
        }

        for (int i = 0; i < 4; i++) {
            char c = userID.charAt(i);
            if (!Character.isLetter(c)) {
                return false;
            }
        }

        for (int i = 4; i < 8; i++) {
            char c = userID.charAt(i);
            if (!Character.isDigit(c)) {
                return false;
            }
        }

        return true;
    }

    public void createUserID(String fullName) {
        String[] nameParts = fullName.split(" ");
        String firstName = nameParts[0];
        String lastName = nameParts[1];

        String firstFour = firstName.substring(0, 2) + lastName.substring(0, 2);

        // Generer de sidste fire cifre tilfældigt
        Random rnd = new Random();
        int num = rnd.nextInt(10000);
        String lastFour = String.format("%04d", num);
        this.userID = firstFour + lastFour;
    }

    public String toString(){
        return userID;
    }
}

