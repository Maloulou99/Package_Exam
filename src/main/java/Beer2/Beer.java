import java.io.IOException;

public class Beer {


    private double price;
    private double alcoholPercentage;
    private String name;


    public Beer(String name) {
        this.name = name;
    }

    public void setAlcoholPercentage(double alcoholPercentage) throws IOException {
        if (alcoholPercentage >= 1 && alcoholPercentage <= 100){
            this.alcoholPercentage = alcoholPercentage;
        } else {
            throw new IOException("Alcohol percentage is too high.");
        }
    }
    public void setPrice(double price) throws IOException{
        if (price >= 1){
            this.price = price;
        } else {
            throw new IOException("price is too high.");
        }
    }

    public double getPrice() {
        return price;
    }
}
