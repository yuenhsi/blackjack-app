package ftl.blackjack;

import java.util.HashMap;
import java.util.Map;

public class BlackJackGame {

    // return -1 if the card is an ace
    public static final Map<Rank, Integer> pointMap = new HashMap<Rank, Integer>();
    static {
        pointMap.put(Rank.DEUCE, 2);
        pointMap.put(Rank.THREE, 3);
        pointMap.put(Rank.FOUR, 4);
        pointMap.put(Rank.FIVE, 5);
        pointMap.put(Rank.SIX, 6);
        pointMap.put(Rank.SEVEN, 7);
        pointMap.put(Rank.EIGHT, 8);
        pointMap.put(Rank.NINE, 9);
        pointMap.put(Rank.TEN, 10);
        pointMap.put(Rank.JACK, 10);
        pointMap.put(Rank.QUEEN, 10);
        pointMap.put(Rank.KING, 10);
        pointMap.put(Rank.ACE, -1);
    }

    public int[] getPoints(Card[] cards) {
        int total = 0;
        int aceCount = 0;
        // total of cards excluding aces
        for (int i = 0; i < cards.length; i++) {
            int point = BlackJackGame.pointMap.get(cards[i].getRank());
            if (point != -1) {
                total += point;
            } else {
                aceCount++;
            }
        }
        // combinations of total points given number of aces
        int[] points = getAceCombinations(aceCount);

        for (int i = 0; i < points.length; i++) {
            points[i] += total;
        }
        return points;
    }

    public int[] getAceCombinations(int aceCount) {
        int[] aceCombinations = new int[]{};
        return aceCombinations;
    }
}
