package MotherBoard;

public class Main {

    public static void main(String[] args) {
        MotherBoard motherBoard = new MotherBoard();
        SataDrive sataDrive = new SataDrive("Malou");
        SataDrive sataDrive1 = new SataDrive("Silvia");
        SataDrive sataDrive2 = new SataDrive("Marie");
        SataDrive sataDrive3 = new SataDrive("Sofie");
        SataDrive sataDrive4 = new SataDrive("Malle");

        motherBoard.udskrivListe(sataDrive, 1);
        motherBoard.udskrivListe(sataDrive1, 2);
        motherBoard.udskrivListe(sataDrive2, 3);
        motherBoard.udskrivListe(sataDrive3, 4);

        System.out.println(sataDrive);
        System.out.println(sataDrive1);
        System.out.println(sataDrive2);
        System.out.println(sataDrive3);

        //Too many Satadrives, check output
        motherBoard.tilkoblingAfSataDrive(sataDrive4);

        System.out.println(sataDrive4);


    }
}
