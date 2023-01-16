package Beer;

public class Beer {


    private String name;
    private int alcoholPercentage;
    private int price;


    public void setAlcoholPercentage(int alcoholPercentage) throws Exception{
        if(alcoholPercentage >= 0 && alcoholPercentage <= 100){
            this.alcoholPercentage = alcoholPercentage;
        } else {
            throw new Exception("Værdi ikke tilladt");
        }
    }

    public void setPrice(int price) throws Exception{
        if (price >= 0 && price <= 100){
            this.price = price;
        } else {
            throw new Exception("Værdi ikke tilladt");
        }
    }

    public int getPrice() {
        return price;
    }


}
