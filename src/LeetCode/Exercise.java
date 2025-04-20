package LeetCode;

import java.util.HashMap;

public class Exercise {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();

        map.put("one", 1);
        map.put("two", 2);
        map.put("three", 3);

        System.out.println(map.get("two"));

        map.put("two", 34);

        System.out.println(map.get("two"));
        System.out.println(map.values());
        System.out.println(map.keySet());
        System.out.println(HM("яблоко груша яблоко банан груша яблоко"));
    }

    public static String HM (String str) {
        //str = "яблоко груша яблоко банан груша яблоко";
        String[] words = str.split(" ");
        HashMap<String, Integer> map = new HashMap<>();
        for (String word : words) {
            if (map.containsKey(word)) {
                map.put(word, map.get(word) + 1);
            } else {
                map.put(word, 1);
            }
        }

        StringBuilder result = new StringBuilder();
        for (String key : map.keySet()) {
           result.append( key).append(": ").append(map.get(key)).append("\n");
        }
    return result.toString();
    }
}

