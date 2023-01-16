package Bil;

public class Bil {

    private Trailer trailer = new Trailer(2000);
    private double vægt;

    public Bil(double vægt){
        this.vægt = vægt;
    }

    private double totalVægt(){
        return trailer.getVægt() + vægt;
    }
    public void tilkobling(){
        if (totalVægt() > 3500){
            System.out.println("Kan ikke tilkobles");
        } else if(totalVægt() < 3500) {
            System.out.println("Kan tilkobles bilen");
        }
    }

    public String toString(){
        return "Vægt " + vægt;
    }
}
