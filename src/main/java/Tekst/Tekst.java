package Tekst;

import java.util.ArrayList;

public class Tekst {

    private ArrayList<String> tekstLinjer = new ArrayList<>();


    public void tilføj(String tekst){
        tekstLinjer.add(tekst);
    }

    public int findAntalUnikke(){
        ArrayList<String> listeTo = new ArrayList<>();
        for (String n : tekstLinjer){
            if (!listeTo.contains(n)){
                listeTo.add(n);
            }
        }
        return listeTo.size();
    }


    public String toString(){
        return tekstLinjer.get(0);
    }

}
