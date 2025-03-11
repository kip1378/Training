package HomeWorks.JavaRush;

import java.util.Scanner;

public class JR5 {
    public static void main(String[] args) {
        double glass = 0.5;
        Scanner console = new Scanner(System.in);
        boolean person = console.nextBoolean();
        if (person) {
            System.out.println((int) Math.ceil(glass));
        } else {
            System.out.println((int) Math.floor(glass));
        }
    }
}
