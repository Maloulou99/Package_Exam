public class Card {


    private Suits suit;
    private int value;

    private enum Suits{
        SPADES,
        HEARTS,
        DIAMONDS,
        CLUBS,
    }
    public Card(Suits suit,int value) {
        this.suit = suit;
        this.value = value;
    }


    public boolean beats(Card card) {
        if (card.suit == suit){
            return value < card.value;
        }
        if (card.suit == Suits.SPADES) {
            return this.suit == Suits.HEARTS;


        } else if (card.suit == Suits.HEARTS) {
            return this.suit == Suits.DIAMONDS;
        } else if (card.suit == Suits.DIAMONDS) {
            return this.suit == Suits.CLUBS;
        } else if (card.suit == Suits.CLUBS) {
            return this.suit == Suits.SPADES;
        }else {
            return false;
        }

    }

    public static void main(String[] args) {
        Card card= new Card(Suits.HEARTS, 2);
        Card card2 = new Card(Suits.SPADES, 9);

        System.out.println(card.beats(card2));
    }


}
