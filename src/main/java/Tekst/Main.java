package Tekst;

public class Main {
    public static void main(String[] args) {
        Tekst tekst = new Tekst();


        tekst.tilføj("Malou");
        tekst.tilføj("Malou");
        tekst.tilføj("Drake");
        tekst.tilføj("Luis");

        System.out.println(tekst.findAntalUnikke());
    }
}
