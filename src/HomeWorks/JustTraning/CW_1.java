package HomeWorks.JustTraning;

import java.util.ArrayList;
import java.util.stream.IntStream;

public class CW_1 {
    public static void main(String[] args) {
        String[] array = {"Keep", "Remove", "Keep", "Remove", "Keep", "Remove"};

        ArrayList<String> resultList = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0) {
                resultList.add(array[i]);
            }
        }
        String[] resultArray = resultList.stream().toArray(String[]::new);
        for (String str : resultArray) {
            System.out.println(str);
        }


    }
}


//Take an array and remove every second element from the array. Always keep the first element and start removing with the next element.
//
//Example:
//        ["Keep", "Remove", "Keep", "Remove", "Keep", ...] --> ["Keep", "Keep", "Keep", ...]
//
//None of the arrays will be empty, so you don't have to worry about that!