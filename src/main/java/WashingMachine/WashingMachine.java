package WashingMachine;

import java.util.ArrayList;

public class WashingMachine {

    private int temperature;
    private boolean isExpressWash;
    private ArrayList<Integer> wash = new ArrayList<>();


    public WashingMachine(int temperature, boolean isExpressWash){
        this.temperature = temperature;
        this.isExpressWash = isExpressWash;

    }

    public boolean isExpressWash() {
        return isExpressWash;
    }

    public int start(){
        int tid = 0;
       if (temperature > 30 && temperature < 40){
           return tid = 90;
       }else if (temperature > 60 && temperature > 90) {
           return tid = 120;
       }else if (isExpressWash){
           return tid = 20;
       }return tid;
    }

    public boolean addWash(int w){
        return wash.add(w);
    }

    public String toString(){
        return temperature + " " + isExpressWash;
    }

}
