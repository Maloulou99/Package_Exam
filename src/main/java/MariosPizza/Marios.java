package MariosPizza;

import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

public class Marios {



    public void saveFile(File file, String string) throws IOException{
        PrintStream printStream = new PrintStream(file);
        printStream.println(string);
        printStream.close();

    }

    public void loadToFile(File file) throws IOException {
        Scanner scanner = new Scanner(file);

        while (scanner.hasNext()){
            System.out.println(scanner.nextLine());
        }



    }

}
