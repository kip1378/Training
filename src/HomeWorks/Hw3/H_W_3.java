package HomeWorks.Hw3;

public class H_W_3 {
    public static void main(String[] args) {
       int a = 5;
       int b = 5;
    if (a==b){
        System.out.println("a == b");
    }
    if (a<b) {
        System.out.println("a<b");
        if(a>b){
            System.out.println( "a>b");
        }
    }
    int c = a+b;
        System.out.println(c);
    if (c%2==0) {
        System.out.println("maybe a and b are even");
    }
    else {
        System.out.println("some variable is odd");
    }


    }

}
