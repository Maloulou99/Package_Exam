package MariosPizza;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        File file = new File("src/main/java/MariosPizza/mario.txt");
        try {
            FileWriter fw = new FileWriter(file, true);
            fw.append("Så tusind tak! Vi er jer evigt taknemmelige!");
            fw.close();
            Scanner sc = new Scanner(file);
            while (sc.hasNextLine()) {
                String data = sc.nextLine();
                System.out.println(data);
            }
            sc.close();
        } catch (IOException e) {
            System.out.println("Værdi ikke tilladt");
        }
    }

}