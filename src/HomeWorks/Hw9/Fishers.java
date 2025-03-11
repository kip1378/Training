package HomeWorks.Hw9;

import HomeWorks.Hw8.MinAndMax;

public class Fishers {
    public static void main(String[] args) {

        Catch[] allCatches = {
         makeCatch("John", "Sturgeon", 20.0, false),
         makeCatch("Bob", "Salmon", 15.0, false),
         makeCatch("Peter", "Salmon", 17.0, true)
        };
        printArray(allCatches);
        System.out.println(totalWeight(allCatches, "Sturgeon", 1));
        System.out.println(totalWeight(allCatches, "Salmon", 2));
        System.out.println(totalWeight(allCatches, "Trout", 0.5));
        System.out.println(allCatches[2].fisher);
    }
static double totalWeight(Catch[] catches, String fishkind, double multiplier) {
        double weight = 0;
        for ( int i =0; i< catches.length; i++){
            Catch elem = catches [i];
            if (elem.fishKind.equals(fishkind) && elem.released){
                weight += elem.weight;
            }

        }
return weight;
}

    static Catch makeCatch(String fisher, String fishKind, Double weight, boolean released){
        Catch c = new Catch();
        c.fisher = fisher;
        c.fishKind = fishKind;
        c.weight = weight;
        c.released = released;
        return c;
    }

    static void printArray(Catch[] arr) {
     for (Catch aCatch : arr) {
       System.out.println(aCatch.makeString());
   }
}
static MinAndMax getMinAndMax(Catch[] catches){
        MinAndMax result = new MinAndMax();
        for (Catch element: catches) {
            if( result.maxCatch == null || element.weight < result.maxCatch.weight) {
                result.maxCatch = element;
            }
            if(result.minCatch == null || element.weight > result.minCatch.weight) {
                result.minCatch = element;
            }
        }
        return result;
}
}
