package CodeWars;

public class Reduce {
    public static int[] myFraction(int[] fractions){
        //your code here
       int a = fractions[0];
       int b = fractions[1];
       while (b != 0) {
           int temp = b;
           b = a % b;
           a = temp;
       }
        return new int[]{fractions[0]/a, fractions[1]/a};
    }
}
