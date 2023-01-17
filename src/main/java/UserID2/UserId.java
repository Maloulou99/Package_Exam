package UserID2;

import java.util.Random;

public class UserId {


    private String fullName;
    private int userId;


    public boolean validUserId(String userId){
        for (int i = 0; i < 4; i++) {
            char c = userId.charAt(i);
            if (!Character.isLetter(c)) {
                return false;
            }
        }

            for (int j = 4; j < 8; j++) {
                char c = userId.charAt(j);
                if (!Character.isDigit(j)){
                    return false;
                }
            } return true;
    }


    public void createUserId(String fullName){
        String[] navn = fullName.split(" ");
        String fullname = navn[0];
        String lastname = navn[1];

        String førsteFire = fullname.substring(0,2) + lastname.substring(0,2);

        Random random = new Random();
        int nummer = random.nextInt(10000);

        String sidsteFire = String.format("%4d", nummer);
        this.userId = Integer.parseInt(førsteFire + sidsteFire);

    }

    public String toString(){
        return userId + fullName;
    }
}
