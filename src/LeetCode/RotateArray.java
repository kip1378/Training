package LeetCode;

public class RotateArray {
    public void rotate(int[] nums, int k) {
        int l = nums.length;
        k = k % l;

           while (k > 0) {
               int last = nums[ l - 1];
               for (int i = l - 1; i > 0; i--) {
                   nums [i] = nums[i -1];


//                   int temp = nums[l - k];
//                   nums[l - k] = nums[i];
//                   nums[i] = temp;
               }
               nums[0] = last;
               k --;

        }
    }
}
