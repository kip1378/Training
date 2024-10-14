package HomeWorks.Hw4;

import java.util.Arrays;

public class HW_4_4 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int i = 0; i < array.length/2; i++) {
            int mirror = array.length - i - 1;
            int temp = array[i];
            array[i] = array[mirror];
            array[mirror] = temp;
        }
                System.out.println(Arrays.toString(array));

    }
    }




/*Дан массив из десяти произвольных целых чисел (например, { 1, 2, …, 9, 10 } )

Необходимо изменить порядок элементов массива на противоположный (т.е. чтобы получилось { 10, 9, …, 2, 1 } ).
Не НАПЕЧАТАТЬ в обратном порядке, а переставить элементы массива.
 */
