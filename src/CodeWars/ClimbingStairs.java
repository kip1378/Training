package CodeWars;

public  class ClimbingStairs {
    public static int climbStairs(int n){

        int current = 0;
        int step1 = 1;
        int step2 = 2;

        if( n == 1) {
            return 1;
        } else if (n == 2) {
            return 2;
        }

        for (int i = 3; i <= n; i++) {
            current = step1 + step2 ;
            step1 = step2;
            step2 = current;

        }

        return current;
    }

    public static void main(String[] args) {
        System.out.println(climbStairs(8));
    }
}
