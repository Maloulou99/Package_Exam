package MariosPizza;

import MariosPizza.Marios;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        try {

            Marios marios = new Marios();
            File file = new File("C:\\Users\\Malou Lundstrøm\\KEA Programmer\\MariosPizza\\src\\main\\java\\mario.txt");

            marios.saveFile(file, "Så tusind tak! Vi er jer evigt taknemmelige!");
            marios.loadToFile(file);

        } catch (IOException e) {
            System.out.println("Værdi ikke tilladt");
        }

    }
}
