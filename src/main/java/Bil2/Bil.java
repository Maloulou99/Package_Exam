package Bil2;

public class Bil {

    private Trailer trailer = new Trailer(2000);
    private double vægt;


    public Bil(double vægt){
        this.vægt = vægt;
    }

    /*public double totalVægt() {
        return trailer.getVægt() + vægt;
    }*/

    public void tilkobling(){
        if ((vægt + trailer.getVægt()) > 3500){
            System.out.println("Kan ikke tilkobles");
        } else if((vægt + trailer.getVægt()) < 3500) {
            System.out.println("Kan tilkobles bilen");
        }
    }

    @Override
    public String toString() {
        return  vægt + trailer.getVægt() +  "";
    }
}
