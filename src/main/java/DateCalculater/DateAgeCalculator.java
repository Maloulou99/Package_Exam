package DateCalculater;

public class DateAgeCalculator {
        private int yourAge = 23;
        private int dateAge = 28;
        boolean ageMatch;


        public void acceptableAge(int lowest){
            lowest = yourAge/2+7;
            int maxAge = yourAge + 10;
            if (dateAge < lowest ||dateAge < maxAge){
                ageMatch = false;
            }else if (dateAge > lowest){
                ageMatch = true;
            }
        }

        public boolean ageMatch(boolean ageMatch){
            if(ageMatch){
                System.out.println("Your date is old enough");
            } else if (!ageMatch){
                System.out.println("Your date is too young");
            } return ageMatch;
        }

    public static void main(String[] args) {

        DateAgeCalculator date = new DateAgeCalculator();

       date.acceptableAge(date.yourAge + date.dateAge);


    }


}