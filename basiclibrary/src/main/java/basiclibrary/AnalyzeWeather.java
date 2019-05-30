package basiclibrary;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class AnalyzeWeather {
    public String analyzeData(int[][] data) {
        Set<Integer> tempValues = new HashSet<>();

        // Populate tempValues
        for (int[] arr: data) {
            for (int temp: arr) tempValues.add(temp);
        }

        int high = Collections.max(tempValues);
        int low = Collections.min(tempValues);

        String output = String.format("High: %d\nLow: %d", high, low);

        for (int i = low; i < high; i++) {
            if (!tempValues.contains(i)) {
                output += String.format("\nNever saw temperature: %d", i);
            }
        }
        return output;
    }
}
