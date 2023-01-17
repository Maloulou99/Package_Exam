package MariosPizza2;

import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        Marios marios = new Marios();
        try{
            marios.loadFile();
            marios.saveFile(new File("src/main/java/MariosPizza2/Marios.txt"), "\n" + "Så tusind tak! Vi er jer evigt taknemmelige!");

        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
