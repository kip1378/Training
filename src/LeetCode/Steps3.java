package LeetCode;

public class Steps3 {
    public int climbStairs(int n) {
        if (n == 1) return 1;
        if (n == 2) return 2;
        if (n == 3) return 4;

        int first = 1, second = 2, third = 4;

        for (int i = 4; i <= n; i++) {
            int temp = first + second + third;
            first = second;
            second = third;
            third = temp;
        }

        return third;
    }
}
