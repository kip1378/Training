package HomeWorks.JustTraning;

public class OppositesAttract {
    public static boolean isLove(final int flower1, final int flower2) {
        return ( flower1 % 2 == 0 && flower2 % 2 != 0) || (flower1 % 2 != 0 && flower2 % 2 == 0);
    }

    public static void main(String[] args) {
        System.out.println(isLove(4, 5));
    }
}

