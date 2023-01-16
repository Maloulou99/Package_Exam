package Cykel;

public class Main {


    public static void main(String[] args) {
        Cykel cykel = new Cykel("Scooper", 1999.99, "rød");
        Cykel cykel1 = new Cykel("DD", 2300, "blå");
        Butik butik = new Butik();

        butik.tilføj(cykel);
        butik.tilføj(cykel1);

        System.out.println(butik.samletLagerBeholdning());
    }
}
