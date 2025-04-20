package LeetCode;

import java.util.HashMap;

public class Exercise2 {
    public static void main(String[] args) {
        Integer[] nums = {1, 2, 2, 3, 1, 4, 2,2,2,2,2,3,4,1,4,5,6,6,4,41,1,23,321,12,8,8,876,5,4,0};
        HashMap<Integer, Integer> CountInts = new HashMap<>();
        for (Integer num : nums) {
            if(CountInts.containsKey(num)) {
                CountInts.put(num, CountInts.get(num) + 1);
            } else {
                CountInts.put(num, 1);
            }
        }
        for(Integer key : CountInts.keySet()){
            System.out.println(key + ": " + CountInts.get(key));
        }
    }
}
