package ftl.blackjack;

import java.util.Arrays;
import java.util.List;

public class Suit {

    public final String suit;

    public Suit(String suit) throws Exception {
        List<String> suits = Arrays.asList(new String[] {"Clubs", "Diamonds", "Hearts", "Spades"});
        if (suits.contains(suit)) {
            this.suit = suit;
        } else {
            throw new Exception("Invalid input");
        }
    }
}
