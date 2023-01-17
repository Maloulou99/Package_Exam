package DateCalculater2;

public class Main {
    public static void main(String[] args) {
        DateAgeCalculater dc = new DateAgeCalculater();

        dc.acceptableAge(23, 25);
        System.out.println(dc.ageMatch());
    }
}
