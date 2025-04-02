package LeetCode;

public class Solution1 {

    public int removeDuplicates(int[] nums) {
        int i = 0;

        for (int j = 1; j < nums.length; j++) {

            if (nums[j] != nums[i]) {
                i += 1;
                nums[i] = nums[j];
            }

        }
        return i + 1;
    }

    //Начинаем: i = 0 (указываем на первый уникальный — 1)
    //j = 1: nums[1] == nums[0] — пропускаем
    //j = 2: nums[2] != nums[0] → i = 1, nums[1] = nums[2] → теперь nums = {1, 2, ...}
    //j = 3: nums[3] != nums[1] → i = 2, nums[2] = nums[3]
    //j = 4: nums[4] == nums[2] → пропускаем

    public static void main(String[] args) {

        Solution1 rem = new Solution1();
        int[] nums = {1, 1, 1, 1, 2, 2, 3, 4, 4, 5};
        int k = rem.removeDuplicates(nums);
        for (int i = 0; i < k; i++) {

            System.out.print(nums[i] + "");
        }
    }
}