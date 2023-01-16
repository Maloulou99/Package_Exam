package Rafflebæger;

import java.util.ArrayList;
import java.util.List;

public class Rafflebaeger {


    private int antalTerninger;
    private ArrayList<Integer> øjneListe;

    public Rafflebaeger(int antalTerninger){
        this.antalTerninger = antalTerninger;
        this.øjneListe = new ArrayList<>();
    }

    public int ryst(){
        int sumØjne = 0;
        for (int i = 0 ; i < antalTerninger ; i++){
            int øjne = (int) (Math.random()*6) + 1;
            øjneListe.add(øjne);
            sumØjne += øjne;
        }
        return sumØjne;
    }


    public ArrayList<Integer> se(){
    return øjneListe;
    }
}
