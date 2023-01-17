package DateCalculater2;

public class DateAgeCalculater {

    private int yourAge;
    private int dateAge;
    private boolean ageMatch;


    public void acceptableAge(int yourAge, int dateAge){
        int lowest = yourAge/2+7;
        int maxAge = yourAge + 10;
        if (dateAge < lowest || dateAge <= maxAge){
            ageMatch = true;
        }else if (dateAge > lowest){
            dateAge = lowest;
            ageMatch = false;
        }
    }

    public boolean ageMatch(){
        if(ageMatch){
            System.out.println("Your date is old enough");
        } else if (!ageMatch){
            System.out.println("Your date is too young");
        } return ageMatch;
    }



}
