package Calculater;

import java.util.*;


public class Calculater {


    //Random random = new Random();
    private ArrayList<Double> tal = new ArrayList<Double>();
    private int[] liste = {2,4,6,10,3};
    private int min = liste[0];

    public void sortering(){
        for (int nummer : liste ) {
            if (nummer < min) {
                min = nummer;
                System.out.println(min);
            }
        }
    }



    public ArrayList<Double> getTal() {
        return tal;
    }

    public void tilføjTal(double tallet){
        tal.add(tallet);
    }

    public double gennemsnit(){
        double sum = 0;
        for (double tal : tal){
            sum += tal;
        } return sum / tal.size();
    }


    public void omvendtTal() {
        Collections.sort(tal, Collections.reverseOrder());
    }

    public String toString(){
        return min + " ";
    }

}
