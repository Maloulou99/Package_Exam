package Cykel2;

public class Cykel {

    private String farve;
    private String mærke;
    private double pris;


    public Cykel(String farve, String mærke, double pris) {
        this.farve = farve;
        this.mærke = mærke;
        this.pris = pris;
    }


    public double getPris() {
        return pris;
    }

    @Override
    public String toString() {
        return "Cykel{" +
                "farve='" + farve + '\'' +
                ", mærke='" + mærke + '\'' +
                ", pris=" + pris +
                '}' + "\n";
    }
}
