package CodeWars;

public class MiddleCharacter {
    public static String getMiddle(String word) {
        int midS = word.length() / 2;
        if (word.length() % 2 != 0) {
            return word.substring(midS, midS+1);

        } else {
            return word.substring(midS - 1, midS + 1);
        }
    }


    public static void main(String[] args) {
        System.out.println(getMiddle("testingg"));
    }
}