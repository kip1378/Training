package CodeWars;

public class Square {
    public static int squareSum(int[] n) {
        int result = 0;
        for (int i = 0; i < n.length; i++) {
            n[i] = n[i] * n[i];
        result += n[i]; }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(squareSum(new int[]{2, 6, 2}));
    }


}
