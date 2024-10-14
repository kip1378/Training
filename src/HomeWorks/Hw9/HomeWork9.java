package HomeWorks.Hw9;

import static javax.management.Query.plus;

public class HomeWork9 {
    public static void main(String[] args) {
       String result = con("Тик", "Ток");
       result = con(result, "!");
        System.out.println(result);
        System.out.println(con("A", "Bmnb "));
        System.out.println(plus( 2, 45));


    }

    private static int plus(int a, int b) {
        return a - b +(a+b);

    }

    static String con(String s1, String s2){
        return s1 + s2;
    }
}
