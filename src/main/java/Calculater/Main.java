package Calculater;

import java.util.Collections;


public class Main {
    public static void main(String[] args) {
        Calculater calculater = new Calculater();

        calculater.tilføjTal(34);
        calculater.tilføjTal(24);
        calculater.tilføjTal(14);
        calculater.tilføjTal(15);
        calculater.tilføjTal(78);
        System.out.println(calculater.gennemsnit());

        calculater.omvendtTal();
        System.out.println(calculater.getTal());


        calculater.sortering();


    }
}
