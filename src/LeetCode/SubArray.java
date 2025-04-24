package LeetCode;

public class SubArray {
    public int maxSubArray(int[] nums) {

        if(nums.length == 1) {
            return nums[0];
        }

        int sum = nums[0];
        int maxSum = nums[0];

        for(int i = 1; i < nums.length; i++ ) {
            sum += nums[i];

            if (sum < nums[i]) {
                sum = nums[i];
            }

            if(sum > maxSum) {
                maxSum = sum;
            }
        }
        return maxSum;
    }
}
