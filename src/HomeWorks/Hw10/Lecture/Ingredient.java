package HomeWorks.Hw10.Lecture;

public abstract class Ingredient {

    private final String name;
    private final String amount;


    public Ingredient(String name, String amount){
        this.name = "pivo";
        this.amount = amount;

    }

    public String getName() {
        return name;
    }
    public String getAmount() {
        return amount;
    }

    public String getDescription(){
        return amount + " of " + name;
    }

   protected abstract String howToMeasure();

}
