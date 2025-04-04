package LeetCode;

import java.util.Arrays;

public class Palindrrrom {
    public void reversArray(int[] nums) {

    int r = nums.length - 1;
        for (int l = 0; l < nums.length; l++) {
            if (r - l > l) {
            int temp = nums[l];
             nums[l] = nums[r - l];
             nums[r - l] = temp;
            }
        }
    }

    public static void main(String[] args) {
        Palindrrrom palindrrrom = new Palindrrrom();
        int [] nums = {1, 2, 3, 4, 5};
        palindrrrom.reversArray(nums);
        System.out.println(Arrays.toString(nums));
    }
}
