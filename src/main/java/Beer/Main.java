package Beer;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        try {
            Beer beer = new Beer();
            beer.setPrice(20);
            beer.setAlcoholPercentage(30);

            Beer beer1 = new Beer();
            beer1.setPrice(24);
            beer1.setAlcoholPercentage(34);

            ArrayList<Beer> beers = new ArrayList<>();
            beers.add(beer);
            beers.add(beer1);

            int sum = 0;
            for (Beer beerSum : beers) {
                sum += beerSum.getPrice();
            }
            int gennemsnit = sum / beers.size();
            System.out.println(gennemsnit);

        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
}
