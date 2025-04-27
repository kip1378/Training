package LeetCode;

import java.util.HashMap;
import java.util.Map;

public class EntrySetGPT {
    public static String result (String[] words) {

        HashMap<String, Integer> count = new HashMap<>();
        for (String word : words) {
            if (count.containsKey(word)) {
                count.put(word, count.get(word) + 1);

            } else {
                count.put(word, 1);
            }
        }
        StringBuilder result = new StringBuilder();
        for (Map.Entry<String, Integer> entry : count.entrySet()) {
            if( entry.getValue() > 1) {
                result.append(entry.getKey()).append( " = ").append(entry.getValue()).append("\n");
            }
            }
        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(result(new String[]{"cat", "dog", "cat", "mouse", "dog", "dog", "cat"}));
    }
}
