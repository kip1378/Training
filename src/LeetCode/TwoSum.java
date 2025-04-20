package LeetCode;

import java.util.HashMap;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {

        //nums = [2,7,11,15]
        //        0,1,2 ,3
        HashMap<Integer, Integer> numMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int cur = nums[i];
            int need = target - cur;
            if(numMap.containsKey(need)) {
                return new int[] {numMap.get(need), i};
            } else {
                numMap.put(nums[i], i);
            }

        }throw new IllegalArgumentException("No two sum");
    }
}

