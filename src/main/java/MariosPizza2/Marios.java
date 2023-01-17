package MariosPizza2;

import java.io.*;
import java.util.Scanner;

public class Marios {

    File file = new File("src/main/java/MariosPizza2/Marios.txt");

    public void saveFile(File file, String string) throws Exception {
        FileWriter fw = new FileWriter(file, true);
        fw.append(string);
        fw.close();
    }

    public void loadFile() throws Exception {
        Scanner sc = new Scanner(new File("src/main/java/MariosPizza2/Marios.txt"));
        while (sc.hasNext()){
            String data = sc.nextLine();
            System.out.println(data);
        }
    }
}


