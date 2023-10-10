import java.sql.SQLOutput;

public class Card {
    private String suit;
    private int value;
    private String faceName;

    public Card(String suit, int value) {
        this.suit = suit;
        this.value = value;

        // format face name
        faceName = "Error";
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
    }

    public String toString() {
        String name;
        name = faceName + " of " + suit;
        return name;
    }
}