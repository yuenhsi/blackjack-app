package ftl.blackjack;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;

public class BlackJackGameActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_blackjack_game);
        Map<String, LinkedList<Card>> hands = setupGame(1);
        LinkedList<Card> dealerHand = hands.get("dealerHand");
        LinkedList<Card> playerHand = hands.get("playerOneHand");

        TextView dealer1 = (TextView) findViewById(R.id.dealer1);
        TextView dealer2 = (TextView) findViewById(R.id.dealer2);
        TextView player1 = (TextView) findViewById(R.id.player1);
        TextView player2 = (TextView) findViewById(R.id.player2);
        dealer1.setText(dealerHand.get(0).toString());
        dealer2.setText(dealerHand.get(1).toString());
        player1.setText(playerHand.get(0).toString());
        player2.setText(playerHand.get(1).toString());
    }

    public Map<String, LinkedList<Card>> setupGame(int playerCount) {
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

