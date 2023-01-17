package HogwartsStudent;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        // Tjekt Exception
        try {
            ArrayList<HogwartsStudent> hogwartsStudents = new ArrayList<>();
            HogwartsStudent hogwartsStudent = new HogwartsStudent("Harry", "Potter");
            HogwartsStudent hogwartsStudent1 = new HogwartsStudent("Ron", "Weasly");

            hogwartsStudent.setHouse("Gryffindor");

            hogwartsStudents.add(hogwartsStudent);
            hogwartsStudents.add(hogwartsStudent1);
            System.out.println(hogwartsStudents);
            Collections.sort(hogwartsStudents);
            System.out.println(hogwartsStudents);

        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }

}
