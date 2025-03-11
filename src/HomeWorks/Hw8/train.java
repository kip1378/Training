package HomeWorks.Hw8;

public class train {
    public static void main(String[] args) {
        System.out.println(concat(concat("тик", "ток"), "!"));
    }

    static String concat(String s1, String s2) {
        return s1 + s2;
    }

}

