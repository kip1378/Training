package HomeWorks.JavaRush;

import java.util.Scanner;

public class JR2 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        double radius = console.nextDouble();
        double pi = 3.14;
        int s = (int)(pi * radius * radius);
        System.out.println(s);
    }
}
