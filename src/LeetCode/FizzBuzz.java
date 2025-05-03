package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {
    public static List<String> fizzBuzz(int n) {
        List<String> lst = new ArrayList<>();

        for(int i = 1; i <= n; i++ ) {
            if (i % 3 == 0 && i % 5 == 0) {
                lst.add("FizzBuzz");
            } else if (i % 5 == 0) {
                lst.add("Buzz");
            } else if (i % 3 == 0) {
                lst.add("Fizz");
            } else {
                lst.add(Integer.toString(i));
            }

        }
        return lst;
    }

    public static void main(String[] args) {
        System.out.println(fizzBuzz(86));
    }
}
