package HomeWorks.JustTraning;

public class JavaR1 {
    public static final String ODD = "Нечётный";
    public static final String EVEN = "Чётный";
    public static String[] strings = new String[5];


    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            strings[i] = i%2==0 ? EVEN : ODD;
        }  //напишите тут ваш код

        System.out.print("index = 0");
        System.out.println(" value = " + strings[0]);
        System.out.print("index = 1");
        System.out.println(" value = " + strings[1]);
        System.out.print("index = 2");
        System.out.println(" value = " + strings[2]);
        System.out.print("index = 3");
        System.out.println(" value = " + strings[3]);
        System.out.print("index = 4");
        System.out.println(" value = " + strings[4]);
    }
}
