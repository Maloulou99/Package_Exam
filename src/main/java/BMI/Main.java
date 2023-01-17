package BMI;

public class Main {
    public static void main(String[] args) {
        Bmi bmi = new Bmi(160,70);


        bmi.calculate();

        System.out.println(bmi.isUnderWeight());
        System.out.println(bmi.isOverWeight());
        System.out.println(bmi.isNormalWeight());

    }
}
