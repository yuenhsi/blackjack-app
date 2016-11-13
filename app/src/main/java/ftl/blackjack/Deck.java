package ftl.blackjack;
// concept of reshuffling and adding all cards once a threshold is hit needs to be implemented. This may be done with a static reshuffle variable.

import java.util.ArrayList;
import java.util.Random;

public class Deck {

    private static int totalCards;
    private ArrayList<Card> deck;

    public Deck() {
        deck = new ArrayList<>();
        for (Suit suit : Suit.values()) {
            for (Rank rank : Rank.values()) {
                Card card = new Card(suit, rank);
                deck.add(card);
                totalCards++;
            }
        }
    }

    public Card draw() {
        Random random = new Random();
        int n = random.nextInt(deck.size());
        Card drawnCard = deck.get(n);
        deck.set(n, deck.get(deck.size() - 1)); // copy the card on the bottom of the deck with the drawn card
        deck.remove(deck.size() - 1);
        return drawnCard;
    }

    public ArrayList getDeck() {
        return deck;
    }

    public static int getTotalCards() {
        return totalCards;
    }
}
