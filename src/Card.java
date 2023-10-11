public class Card {
    private String suit;
    private int suitValue;
    private int value;
    private String faceName;
    private int effectiveValue;

    public Card(String suit, int value) {
        this.suit = suit;
        this.value = value;

        // set suit value
        switch (suit) {
            case "Spades": {
                suitValue = 4;
                break;
            }
            case "Clubs": {
                suitValue = 3;
                break;
            }
            case "Diamonds": {
                suitValue = 2;
                break;
            }
            case "Hearts": {
                suitValue = 1;
                break;
            }

        }

        // format face name
        switch (value) {
            case 1: {
                faceName = "Ace";
                break;
            }
            case 11: {
                faceName = "Jack";
                break;
            }
            case 12: {
                faceName = "Queen";
                break;
            }
            case 13: {
                faceName = "King";
                break;
            }
            default: {
                faceName = Integer.toString(value);
                break;
            }
        }

        // get effective value
        if (value == 1) { // ace is higher than everything else
            effectiveValue = 13 + (13 * (suitValue - 1));
        }
        else {
            effectiveValue = (value - 1) + (13 * (suitValue - 1));
        }
    }

    public String toString() {
        String name;
        name = faceName + " of " + suit;
        return name;
    }

    public int CompareTo(Card card2) {
        /*
        System.out.println(card1.suitValue);
        System.out.println(card2.suitValue);
        */
        // check if same
        if (effectiveValue == card2.effectiveValue) {
            return 0;
        }
        // check if higher
        else if (effectiveValue > card2.effectiveValue) {
            return 1;
        }
        // if lower
        else {
            return -1;
        }
    }
}