package LeetCode;

public class ReverseString {
    public void reverseString(char[] s) {
        int j = 0;
        int i = s.length -1;
        while (j < i){
                char temp = s[j];
                s[j] = s[i];
                s[i] = temp;
                i--;
                j++;
        }
    }

    public static void main(String[] args) {
        ReverseString reverseString = new ReverseString();
        char[] s = {'h','e','l','l','o'};

        reverseString.reverseString(s);
        System.out.println(s);
    }
}

