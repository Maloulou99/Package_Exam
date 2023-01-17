import java.io.IOException;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        try{
            ArrayList<Beer> beers = new ArrayList<>();
            Beer beer = new Beer( "Tuborg");
            beer.setAlcoholPercentage(4.5);
            beer.setPrice(10);
            Beer beer1 = new Beer("Carlsberg");
            beer1.setAlcoholPercentage(7.6);
            beer1.setPrice(2);
            Beer beer2 = new Beer("Heneckin");
            beer2.setAlcoholPercentage(6.9);
            beer2.setPrice(40);

            beers.add(beer);
            beers.add(beer1);
            beers.add(beer2);


            int sum = 0;
            for (Beer sumBeer : beers){
                sum += sumBeer.getPrice();
            }
            double gennemsnit =  sum /beers.size() ;
            System.out.println(gennemsnit);


        } catch (IOException e){
            System.err.println("Forkert");
        }
    }
}
