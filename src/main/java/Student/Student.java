package Student;

import com.sun.source.tree.BreakTree;

import java.util.Arrays;

public class Student {

        private String name;
        private int[] examGrades = new int[5];

        public Student(String name) {
            this.name = name;
        }

        public void setGrade(int examNum, int grade) {
            if (examNum >= 1 && examNum <= 5) {
                examGrades[examNum - 1] = grade;
            }
        }

        public void printDiploma() {
            int totalGrade = 0;
            for (int grade : examGrades) {
                totalGrade += grade;
            }
            double grade = (double) totalGrade / examGrades.length;

            System.out.println("Diplom til " + name);
            System.out.println("Din karakter: " + grade);

            if (grade >= 7) {
                System.out.println("Flot arbejde");
            } else if (grade >= 4) {
                System.out.println("Godt gået, men mulighed for forbedring");
            } else {
                System.out.println("Arbejd hårdere...");
            }
        }

        public String toStrings(){
            return examGrades + " " + name + " ";
        }
    }
