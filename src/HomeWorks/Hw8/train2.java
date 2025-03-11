package HomeWorks.Hw8;

import java.util.Arrays;

public class train2 {
    public static void main(String[] args) {
        String[] words = { "мороз", "и", "солнце", "день", "чудесный"};

        System.out.println(shortestString(words));
        System.out.println(Arrays.toString(toUppercase(words)));
    }

    static String shortestString (String[] strings) {
        if (strings.length == 0) {
            System.out.println("Can't find shortest");
            return null;
        }
        String shortest = strings[0];
       for (String str: strings) {
           if (str.length() < shortest.length()) {
               shortest = str;
           }
       }
       return shortest;
    }
    static String[] toUppercase (String[] strings){
        String [] result = new String[strings.length];
        for (int i =0; i < strings.length; i++) {
            result[i] = strings[i].toUpperCase();
        }
        return result;
    }
}
