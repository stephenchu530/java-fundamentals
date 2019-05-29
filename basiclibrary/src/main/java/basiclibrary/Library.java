/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package basiclibrary;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Library {
    // This methods rolls a 6-sided dice n times
    public static int[] roll(int n) {
        Random rand = new Random();
        int[] rolls = new int[n];

        for (int i = 0; i < n; i++) {
            rolls[i] = rand.nextInt(6);
        }
        return rolls;
    }

    // This method returns true/false if an array contains duplicate values
    public static boolean containsDuplicates(int[] arr) {
        Set<Integer> testSet = new HashSet<Integer>();
        for (int ele: arr) {
            if (testSet.add(ele) == false) { return false; }
        }
        return true;
    }

    // This method calculates and returns the average of all values in an array
    public static float calculateAverage(int[] arr) {
        float sum = 0.0f;
        float average;

        if (arr.length == 0) { return 0.0f; }
        for (int value: arr) { sum += value; }
        average = sum / arr.length;
        return average;
    }

    // This method returns the lowest average given an array of arrays
    public static float lowestAverage(int[][] arrOfArr) {
        if (arrOfArr.length == 0) { return 0.0f; }

        float lowest = calculateAverage(arrOfArr[0]);
        float current;

        for (int[] arr: arrOfArr) {
            current = calculateAverage(arr);
            if (current < lowest) {
                lowest = current;
            }
        }
        return lowest;
    }
}
