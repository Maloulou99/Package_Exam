package Tal2;

import java.util.Random;

public class Tal2 {


    private Random random = new Random();
    private int[] tal = new int[10];

    public int generererTal(){
        return random.nextInt(1,6);
    }

    public void lavMangeTal(){
        for (int i = 0 ; i < tal.length; i++){
            tal[i] = generererTal();
        }
    }

    public int[] getTilfældigeTal(){
        return tal;
    }
}
