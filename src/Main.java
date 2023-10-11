public class Main {
    public static void main(String[] args) {
        Deck deck1 = new Deck();
        deck1.Display();
        Card card1 = deck1.getCard(0);
        Card card2 = deck1.getCard(1);

        int result = card1.CompareTo(card2);
        System.out.println(result);
    }
}