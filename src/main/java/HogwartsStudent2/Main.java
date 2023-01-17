package HogwartsStudent2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.logging.ErrorManager;

public class Main {

    public static void main(String[] args) {

        try {
            HogwartsStudent hogwartsStudent = new HogwartsStudent("Harry", "Potter");
            HogwartsStudent hogwartsStudent1 = new HogwartsStudent("Ron", "Weasly");

            hogwartsStudent.setHouse("Gryffindor");

            ArrayList<HogwartsStudent> hogwartsStudents = new ArrayList<>();
            hogwartsStudents.add(hogwartsStudent);
            hogwartsStudents.add(hogwartsStudent1);
            System.out.println(hogwartsStudents);
            Collections.sort(hogwartsStudents);
            System.out.println(hogwartsStudents);



        } catch (Exception e){
            System.out.println("Værdi ikke tilladt");
        }

    }
}
