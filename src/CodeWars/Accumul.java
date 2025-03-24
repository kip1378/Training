package CodeWars;

public class Accumul {
    public static String accum(String s) {
//     StringBuilder sb = new StringBuilder();
        String [] str = s.split("");
        String [] acc = new String[str.length];
        for (int i = 0; i < str.length; i++) {
            acc [i] =str[i].toUpperCase() + str[i].toLowerCase().repeat(i);
        }
        return String.join("-", acc);
    }

    public static void main(String[] args) {
        System.out.println(accum("ZpglnRxqenU"));
    }
}
