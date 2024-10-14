package HomeWorks.Hw7;

public class HomeWork7 {

    public static int sum (int a, int b){
        return a + b;
    }

    public static int minus (int a, int b){
        return a - b;
    }

    public static int mult (int a, int b){
        return a * b;
    }

    public static double div (int a, int b){
        return 1.0 * a / b;
    }

    public static void main(String[] args) {
        System.out.println( sum(3, 5));
        System.out.println( minus(3,  5));
        System.out.println( mult(3, 5));
        System.out.println( div(29, 5));
    }
}
