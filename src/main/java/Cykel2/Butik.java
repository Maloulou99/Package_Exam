package Cykel2;

import java.util.ArrayList;

public class Butik {


    private ArrayList<Cykel> cykler = new ArrayList<>();

    public void tilføj(Cykel cykel){
        cykler.add(cykel);
    }

    public double samletLagerBeholdning(){
        double sum = 0;
        for (Cykel cykel : cykler){
            sum += cykel.getPris();
        } return sum;
    }

    @Override
    public String toString() {
        return "Butik{" +
                "cykler=" + cykler +
                '}';
    }
}
