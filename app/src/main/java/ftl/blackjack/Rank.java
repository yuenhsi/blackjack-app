package ftl.blackjack;

import java.util.Arrays;
import java.util.List;

public class Rank {

    public final String rank;

    public Rank(String rank) throws Exception {
        List<String> ranks = Arrays.asList(new String[] {"1","2","3","4","5","6","7","8","9","10","J","Q","K","A"});
        if (ranks.contains(rank)) {
            this.rank = rank;
        } else {
            throw new Exception("Invalid input");
        }
    }
}
