package HomeWorks.JustTraning;

import com.sun.jdi.Value;

public class SmallestIntegerFinder {
    public static int findSmallestInt(int[] args) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < args.length; i++) {
            if (min > args[i]) {
                min = args[i];
            }
        }
        return min;

    }

    public static int biggestNumber(int[] args) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < args.length; i++) {
            if (max < args[i]) {
                max = args[i];
            }

        }
        return max;
    }

    public static void main(String[] args) {
        int[] numbers = {34, 23, 12, 43, 54, 37, 45, 654};
        System.out.println(biggestNumber(numbers));
        System.out.println(findSmallestInt(numbers));
    }

//    public static flooatF() {
//        float f = 3.5
//        int max = Integer.parseInt(Integer.toString(f * 10));
//
//    }
}
