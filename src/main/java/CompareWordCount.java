
/*
Return true if the given 2 words occur equally in a sentence, otherwise return false.
 */

public class CompareWordCount {

    public static void main(String[] args) {
        String sentence = "Hello World! Programming is fun. Fun fact: i love programming!";
        String word1 = "programming";
        String word2 = "fun";
        System.out.println(areWordCountsEqual(sentence, word1, word2));
    }

    public static boolean areWordCountsEqual(String sentence, String word1, String word2) {
        int word1Count = 0, word2Count = 0;
        sentence = sentence.replaceAll("[^\\p{L}\\s]", "");
        String[] words = sentence.split("\\s+");
        for (String i : words) {
            if (word1.equalsIgnoreCase(i))
                word1Count++;
            if (word2.equalsIgnoreCase(i))
                word2Count++;
        }
        return word1Count == word2Count;
    }
}