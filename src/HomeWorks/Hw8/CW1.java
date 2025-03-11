package HomeWorks.Hw8;

public class CW1 {
    public static void main(String[] args) {
        System.out.println("Спать хочу пезда, буду авца щитать...."+ countingSheep(3));
    }
    public static String countingSheep(int num) {
        StringBuilder stringBuilder = new StringBuilder();
        for( int i= 1; i <= num; i++){
            stringBuilder.append(i).append("sheep...");
        }
        return stringBuilder.toString();

    }

}








//Given a non-negative integer, 3 for example, return a string with a murmur:
// "1 sheep...2 sheep...3 sheep...".
// Input will always be valid, i.e. no negative integers.