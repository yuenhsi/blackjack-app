package ftl.blackjack;

import android.support.v4.view.MotionEventCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.widget.TextView;

import java.util.LinkedList;

public class BlackJackGameActivity extends AppCompatActivity {

    boolean listening = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_blackjack_game);

        // expand to take number of players as an argument
        Deck deck = new Deck();
        LinkedList<Card> dealerHand = getHand(deck);
        LinkedList<Card> playerHand = getHand(deck);

        TextView dealer1 = (TextView) findViewById(R.id.dealer1);
        TextView dealer2 = (TextView) findViewById(R.id.dealer2);
        TextView player1 = (TextView) findViewById(R.id.player1);
        TextView player2 = (TextView) findViewById(R.id.player2);
        dealer1.setText(dealerHand.get(0).toString());
        dealer2.setText(dealerHand.get(1).toString());
        player1.setText(playerHand.get(0).toString());
        player2.setText(playerHand.get(1).toString());

        listening = true;
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        int action = MotionEventCompat.getActionMasked(event);

        switch (action) {
            default :
                return true;
        }
    }

    public LinkedList<Card> getHand(Deck deck) {
        LinkedList<Card> hand = new LinkedList<Card>();
        hand.add(deck.draw());
        hand.add(deck.draw());
        return hand;
    }
}

