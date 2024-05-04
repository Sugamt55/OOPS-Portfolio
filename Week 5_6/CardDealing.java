package Week5_6;
import java.util.Random;

class Card {
    private String suit;
    private String faceValue;

    // Constructor to initialize suit and face value of the card
    public Card(String suit, String faceValue) {
        this.suit = suit;
        this.faceValue = faceValue;
    }

    // Getter methods
    public String getSuit() {
        return suit;
    }

    public String getFaceValue() {
        return faceValue;
    }

    // Method to represent card as a string
    public String toString() {
        return faceValue + " of " + suit;
    }
}

public class CardDealing {
    public static void main(String[] args) {
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] faceValues = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};

        // Array to hold dealt cards
        Card[] dealtCards = new Card[5];

        Random random = new Random();

        // Deal five random cards
        for (int i = 0; i < 5; i++) {
            String suit = suits[random.nextInt(suits.length)];
            String faceValue = faceValues[random.nextInt(faceValues.length)];
            dealtCards[i] = new Card(suit, faceValue);
        }

        // Print the dealt cards
        System.out.println("Dealt Cards:");
        for (Card card : dealtCards) {
            System.out.println(card);
        }
    }
}