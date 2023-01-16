package Film;

import org.w3c.dom.ls.LSOutput;

public class Main {

    public static void main(String[] args) {
        Film film = new Film("Junglebogen", 1999, new Producer("Malou", 23));
        Film film1 = new Film("Junglebogen 2");

        System.out.println(film);
    }



}
