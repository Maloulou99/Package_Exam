package TalListe;

public class Tal {


    private int[] liste = {5, 66, 12, 87, 66, 56, 89, 66};

    public int tælTal(int tal) {
        int tæller = 0;
        for (int i : this.liste) {
            if (i == tal) {
                tæller++;
            }
        }
        return tæller;
    }

    public double gennemsnit() {
        double snit = 0;
        for (int tal : liste) {
            snit += tal;
        }
        return snit / liste.length;
    }

}
