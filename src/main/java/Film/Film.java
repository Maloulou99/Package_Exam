package Film;

public class Film {

    private String filmTitle;
    private int udgivelsesÅr;
    private Producer producer;



    public Film(String filmTitle, int udgivelsesÅr, Producer producer){
        this.filmTitle = filmTitle;
        this.udgivelsesÅr = udgivelsesÅr;
        this.producer = producer;
    }

    public Film(String filmTitle){
        this.filmTitle = filmTitle;
    }


    public String toString(){
        return filmTitle + " " +  udgivelsesÅr;
    }

}
