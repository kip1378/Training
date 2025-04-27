package LeetCode;

import java.util.HashMap;

public class RomeToInt {
    public int romanToInt(String s) {

        int sum = 0;
        HashMap<Character, Integer> ints = new HashMap<>();
        ints.put('I',1);
        ints.put('V',5);
        ints.put('X',10);
        ints.put('L',50);
        ints.put('C',100);
        ints.put('D',500);
        ints.put('M',1000);

        for (int i = 0; i < s.length() - 1; i++) {
            if(ints.get(s.charAt(i)) < ints.get(s.charAt(i+1))) {
                sum = sum - ints.get(s.charAt(i));
            } else //(s.charAt(i) >= s.charAt(i+1))
            {
                sum = sum + ints.get((s.charAt(i)));
            }
        }
        sum += ints.get(s.charAt(s.length() - 1));
        return sum;
    }
}
