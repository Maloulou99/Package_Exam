package Tal3;

import java.util.Arrays;
import java.util.Random;

public class Tal {

    private int[] tal = new int[10];
    private Random random = new Random();

    public int generererTal(){
        return random.nextInt(1,6);
    }

    public void lavMangeTal(){
        for (int i = 0 ; i < tal.length ; i++) {
            tal[i] = generererTal();
        }
    }

    public int[] getTilfældigeTal(){
        return tal;
    }

    @Override
    public String toString() {
        return "Tal{" +
                "tal=" + Arrays.toString(tal) +
                '}';
    }
}
