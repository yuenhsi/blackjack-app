package ftl.blackjack;

        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;

        import java.util.LinkedHashMap;
        import java.util.LinkedList;
        import java.util.Map;

public class BlackJackGameActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_blackjack_game);
        Map hands = setupGame(1);
        int i = 1;
    }

    public Map setupGame(int playerCount) {
        Deck deck = new Deck();
        Map<String, LinkedList<Card>> hands = new LinkedHashMap<String, LinkedList<Card>>();

        LinkedList<Card> dealerHand = new LinkedList<Card>();
        dealerHand.add(deck.draw());
        dealerHand.add(deck.draw());
        hands.put("dealerHand", dealerHand);

        // handle case of multiple players
        LinkedList<Card> playerHand = new LinkedList<Card>();
        playerHand.add(deck.draw());
        playerHand.add(deck.draw());
        hands.put("playerOneHand", playerHand);
        return hands;
    }
}

