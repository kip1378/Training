package HomeWorks.Hw4;

import java.util.Arrays;

public class HW_4_3 {
    public static void main(String[] args) {
        int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
        for (int index = 0; index < array.length; index++){
            array[index] = array[index] + 15;
        }
        System.out.println(Arrays.toString(array));
    }
}
//Дан массив:
//int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
//необходимо увеличить все значения массива на 15.