package basiclibrary;

import java.util.List;
import java.util.HashMap;

public class Tally {
    public String tally(List<String> votes) {
        HashMap<String, Integer> voteTallies = new HashMap<>();
        String winner = "";
        int count = 0;

        for (String name: votes) {
            if (voteTallies.containsKey(name)) {
                voteTallies.put(name, voteTallies.get(name) + 1);
            } else {
                voteTallies.put(name, 1);
            }
        }
        for (String name: voteTallies.keySet()) {
            if (voteTallies.get(name) > count) {
                count = voteTallies.get(name);
                winner = name;
            }
        }
        return winner;
    }
}
