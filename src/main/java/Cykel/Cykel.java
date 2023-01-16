package Cykel;

import com.sun.source.tree.BreakTree;

public class Cykel {
    private String mærke;
    private double pris;
    private String farve;

    public Cykel(String mærke, double pris, String farve){
        this.mærke = mærke;
        this.pris = pris;
        this.farve = farve;

    }

    public double getPris() {
        return pris;
    }
}
