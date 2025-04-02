package CodeWars;

import java.util.ArrayList;

public class List10000 {
    public static void main(String[] args) {
        ArrayList<Integer> ints = new ArrayList<>();


        for (int i = 100; i < 1000; i++) {
            ints.add(i);
        }
        for (Integer i = ints.size()-1; i >=0 ; i--) {
            if(ints.get(i) % 2 == 0 ){
            ints.remove(i.intValue());
            }
        }


//        ints.removeIf(s -> s.equals(s % 2));


//        for (int i = ints.size() - 1; i >= 0; i--) {
//            ints.removeIf(s -> s.equals(s % 2));

            System.out.println(ints);
        }


    }


