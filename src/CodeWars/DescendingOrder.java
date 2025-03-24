package CodeWars;

import java.util.Arrays;
import java.util.Collections;

public class DescendingOrder {
    public static int sortDesc(final int num) {
//        String str = Integer.toString(num);
//        char[] charArray = str.toCharArray();
//        Integer[] digitsArray= new Integer[charArray.length];
//            for (int i = 0; i < charArray.length; i++) {
//             digitsArray [i] = Character.getNumericValue(charArray[i]);
//            }
//
//        Arrays.sort(digitsArray, Collections.reverseOrder());
//        int nbr = 0;
//        for (int i = 0; i < digitsArray.length; i++) {
//            nbr = nbr * 10 +digitsArray[i];
//        }

        String [] nmbr = String.valueOf(num).split("");
        Arrays.sort(nmbr, Collections.reverseOrder());
        return Integer.parseInt(String.join("", nmbr));
    }

    public static void main (String[] args) {
        System.out.println(sortDesc(563642114));
    }
}

