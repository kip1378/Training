package LeetCode;

import com.sun.source.tree.BreakTree;

import java.util.HashMap;

public class FirstUniqueCharacter {
    public int firstChar(String s) {

        HashMap<Character, Integer> count = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (count.containsKey(s.charAt(i))) {
                count.put(s.charAt(i), count.get(s.charAt(i)) + 1);
            } else {
                count.put(s.charAt(i), 1);
            }
        }
        for (int i = 0; i < s.length(); i++) {
            if (count.get(s.charAt(i)) == 1) {
                return i;
            }
//            } else {
//                return -1;
//            }
        }
        return -1;
    }

}
