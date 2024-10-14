package HomeWorks.Hw9;

public class Fishers {
    public static void main(String[] args) {

        Catch[] allCatches = {
         makeCatch("John", "Sturgeon", 20.0, false),
         makeCatch("Bob", "Salmon", 15.0, false),
         makeCatch("Peter", "Salmon", 17.0, true)
        };
        printArray(allCatches);
        System.out.println(totalWeight(allCatches, "Sturgeon"));
    }
static double totalWeight(Catch[] catches, String fishkind) {
        double weight = 0;
        for ( int i =0; i< catches.length; i++){
            Catch elem = catches [i];
            if (elem.fishKind.equals(fishkind)){
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
}
