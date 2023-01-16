package MotherBoard;

public class MotherBoard {


    private SataDrive[] drives = new SataDrive[4];


    public void udskrivListe(SataDrive drive, int index) {
        if (index >= 0 && index < 4) {
            drives[index] = drive;
        }
    }

    public void tilkoblingAfSataDrive(SataDrive drive) {
        for (int i = 0; i < 4; i++) {
            if (drives[i] == null) {
                drives[i] = drive;
            }
        }
        System.out.println("Ikke mere plads");
    }

    public String toString(){
        return drives + " " + drives[drives.length];
    }


}
