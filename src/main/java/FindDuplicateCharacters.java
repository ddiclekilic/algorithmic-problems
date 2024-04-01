/*
Write a method to return duplicate characters (occurrence>=2) from an input string in the
same order they are in the input. Each duplicate character must exist only once in the output string.
Input string is all lowercase and no whitespace.
Output string is all lowercase and no whitespace.
 */

import java.util.LinkedHashMap;
import java.util.Map;

public class FindDuplicateCharacters {

    public static void main(String[] args) {
        String input = "happy";
        System.out.println(findDuplicateCharacters(input));
    }

    public static String findDuplicateCharacters(String input) {
        LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();
        StringBuilder output = new StringBuilder();
        for (char c : input.toCharArray()) {
            if (map.containsKey(c)) {
                int value = map.get(c);
                value++;
                map.put(c, value);
            } else {
                map.put(c, 1);
            }
        }
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() >= 2) {
                output.append(entry.getKey());
            }
        }
        return output.toString();
    }
}