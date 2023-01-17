package HogwartsStudent3;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        try {
            HogwartsStudent hs = new HogwartsStudent("Harry", "Potter");
            HogwartsStudent hs1 = new HogwartsStudent("Ron", "Weasly");

            ArrayList<HogwartsStudent> hogwartsStudentArrayList = new ArrayList<>();
            hogwartsStudentArrayList.add(hs1);
            hogwartsStudentArrayList.add(hs);
            System.out.println(hogwartsStudentArrayList);
            Collections.sort(hogwartsStudentArrayList);
            hs.setHouse("Gryffindor");
            System.out.println(hogwartsStudentArrayList);

        } catch (Exception e){
            System.out.println("Fejl");
        }
    }
}
