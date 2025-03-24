package CodeWars;

import java.util.Locale;

public class Troll {
//    public static String disemvowel(String str) {
////        str = str.toLowerCase();
//        String [] vowels = {"a", "e", "i", "o", "u"};
//        for ( String vowel : vowels) {
//           str = str.replace(vowel, "").replace(vowel.toUpperCase(),"");
//        }
//        return str;
//    }


    public static String disemvowel(String str) {
        return str.replaceAll("[aAeEiIoOuU]", "");
    }

    public static void main(String[] args) {
        System.out.println(disemvowel("This website is for losers LOL!"));
    }
}