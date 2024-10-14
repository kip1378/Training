package HomeWorks.Hw5;

public class HW_5_1 {
    public static void main(String[] args) {
        int total = 0;
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        for (int i = 0; i < array.length; i++){
            total = (array[i] + total);
        }
        System.out.println( "Среднее арифметическое = " + total / 2);
    }
}
/*
Дан массив:
int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
необходимо вывести среднее арифметическое всех значений массива.


*/

