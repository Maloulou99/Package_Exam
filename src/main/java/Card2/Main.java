package Card2;

public class Main {
    public static void main(String[] args) {
        Card card = new Card(Card.Suit.CLUBS, 5);
        Card card1 = new Card(Card.Suit.SPADES, 10);

        System.out.println(card1.beats(card));
        System.out.println(card);
        System.out.println(card1);

    }
}
