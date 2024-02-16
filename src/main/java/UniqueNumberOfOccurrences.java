
/*
Given an array of integers arr, return true if the number of occurrences
of each value in the array is unique or false otherwise.
 */

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class UniqueNumberOfOccurrences {

    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 1, 1, 3};
        System.out.println(uniqueOccurrences(arr));
    }

    public static boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        HashSet<Integer> set = new HashSet<>();
        for (int i : arr) {
            if (map.containsKey(i))
                map.put(i, (map.get(i) + 1));
            else
                map.put(i, 1);
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (!set.add(entry.getValue()))
                return false;
        }
        return true;
    }
}