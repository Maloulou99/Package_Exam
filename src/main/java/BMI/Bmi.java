package BMI;

public class Bmi {

    private double height;
    private double weight;
    private double bmi = 0;


    public Bmi(double height, double weight){
        this.weight = weight;
        this.height = height;
    }

    public void calculate(){
        bmi = weight/height;
    }


    public boolean isUnderWeight(){
        if (bmi <= 18.5 && bmi >= 0){
            System.out.println("You are under weight");
        }
        return false;
    }

    public boolean isOverWeight(){
        if (bmi >= 25){
            System.out.println("You are over weight");
        }
        return false;
    }

    public boolean isNormalWeight(){
        if (bmi > 18.5 && bmi < 25){
            System.out.println("You are normal weight");
        }
        return false;
    }

    public String toString(){
        return height + " " + weight + " " + bmi;
    }
}
