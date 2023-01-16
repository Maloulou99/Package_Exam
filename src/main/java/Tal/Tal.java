package Tal;

import com.sun.source.tree.BreakTree;

import javax.management.relation.RelationNotification;
import java.util.ArrayList;
import java.util.Random;

public class Tal {

    private Random random = new Random();
    private int[] tal = new int[10];

    private int generereNummer() {
        return random.nextInt(1, 6);
    }

    public void lavMangeTal() {
        for (int i = 0; i < tal.length; i++) {
            tal[i] = generereNummer();
        }
    }

    public int[] getTilfældigeTal() {
        return tal;
    }


}


