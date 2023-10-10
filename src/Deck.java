public class Deck {
    Card[] cards;
    public Deck() {
        cards = new Card[52];
        for (int i = 0; i < 52;) {
            String name;
            if (i < 13) {
                name = "Spades";
            } else if (i < 26) {
                name = "Hearts";
            } else if (i < 39) {
                name = "Diamonds";
            } else if (i < 52) {
                name = "Clubs";
            } else {
                name = "Error";
            }
            for (int j = 1; j <= 13; j++) {
                Card card = new Card(name, j);
                cards[i] = card;
                i++;
            }
        }
    }

    public void Display() {
        for (int i = 0; i < cards.length; i++) {
            System.out.println(cards[i]);
        }
    }
}