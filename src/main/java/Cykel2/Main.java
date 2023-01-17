package Cykel2;

public class Main {

    public static void main(String[] args) {
        Butik butik = new Butik();
        Cykel cykel = new Cykel("Rød", "Scooper", 2000);
        Cykel cykel1 = new Cykel("Rød", "Ukendt", 2000);

        butik.tilføj(cykel);
        butik.tilføj(cykel1);
        butik.samletLagerBeholdning();

        System.out.println(butik);
        System.out.println(butik.samletLagerBeholdning());
    }

}
