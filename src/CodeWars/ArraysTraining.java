package CodeWars;

import java.text.StringCharacterIterator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class ArraysTraining {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.addAll(Arrays.asList("White","Tan", "Yellow", "Orange", "Red", "Pink", "Purple", "Blue"));
        list.replaceAll(s -> s.toLowerCase());

        // пример 1.
//        list.removeIf(s -> s.contains("l"));
//        System.out.println(list);


        // пример 2
//        for (int i = list.size() - 1; i >= 0; i--) {
//
//            if (list.get(i).contains("l")) {
//                list.remove(i);
//            }
//        }

        Iterator<String> li = list.iterator();
        while (li.hasNext()) {
            String nextS = li.next();
            if (nextS.contains("l")) {
                li.remove();
            }
        }




        System.out.println(list);
    }
}