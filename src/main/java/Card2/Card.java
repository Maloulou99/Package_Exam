package Card2;

public class Card {

    private int value;
    private Suit suit;

    public enum Suit{
        SPADES,
        HEARTS,
        DIAMONDS,
        CLUBS,
    }



    public Card(Suit suit, int value) {
        this.suit = suit;
        this.value = value;
    }

    public boolean beats(Card card){
        if (card.suit == suit){
            return value < card.value;
        }
        if (card.suit == Suit.SPADES){
            return this.suit == Suit.HEARTS;
        } else if (card.suit == Suit.HEARTS) {
            return this.suit == Suit.DIAMONDS;
        } else if (card.suit == Suit.DIAMONDS) {
            return this.suit == Suit.CLUBS;
        } else if (card.suit == Suit.CLUBS) {
            return this.suit == Suit.SPADES;
        } return false;
    }


    @Override
    public String toString() {
        return "Card{" +
                "value=" + value +
                ", suit=" + suit +
                '}';
    }
}
