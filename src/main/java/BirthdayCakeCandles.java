
/*
You are in charge of the cake for a child's birthday.
You have decided the cake will have one candle for each year of their total age.
They will only be able to blow out the tallest of the candles. Count how many candles are tallest.
*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BirthdayCakeCandles {
    public static void main(String[] args) {
        List<Integer> candles = new ArrayList<>(Arrays.asList(3, 1, 2, 3));
        System.out.println(birthdayCakeCandles(candles));
    }

    public static int birthdayCakeCandles(List<Integer> candles) {
        int size = candles.size();
        int largest = candles.get(0);
        int count = 1;
        for (int i = 1; i < size; i++) {
            if (candles.get(i) > largest) {
                largest = candles.get(i);
                count = 1;
            } else if (candles.get(i) == largest) {
                count++;
            }
        }
        return count;
    }
}