package HomeWorks.JustTraning;

import java.util.Scanner;

public class JavaRush1 {


        public static void main(String[] args) {

            Scanner console = new Scanner(System.in);
            int sum = 0;

            boolean isExit = false;

            while (!isExit) {
                    String input = console.nextLine();
                if (input.equalsIgnoreCase("ENTER")) {
                    isExit = true;
                    continue; // Пропускаем оставшуюся часть цикла
                }
                try { int number = Integer.parseInt(input);
                    sum += number;
                } catch (NumberFormatException e) {
                    System.out.println("It's not a digit");
                }

            }
            System.out.println("Сумма" + sum);
            console.close();
        }

//    public static void main(String[] args) {
//        //напишите тут ваш код
//        int height = 10;
//        int width = 20;
//
//        int row = 0;
//        while (row < height) {
//
//            int column = 0;
//            while (column < width) {
//                if (row == 0 || row == height - 1 || column == 0 || column == width - 1) {
//                    System.out.print("Б");
//                } else {
//                    System.out.print(" ");
//                }
//                column++;
//            }
//
//            System.out.println();
//            row++;
//        }
//    }
}

