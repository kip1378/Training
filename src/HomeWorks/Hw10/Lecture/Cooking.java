package HomeWorks.Hw10.Lecture;

public class Cooking {
    public static void main(String[] args) {
        Ingredient potatoes = new SolidIngredient( "potatoes", 1.5);
        Ingredient milk = new LiquidIngredient( " milk", 100);
        Ingredient cognak = new Bottle("cognak");

        Ingredient[] allIngredient ={potatoes, milk, cognak};
        for (Ingredient ingredient : allIngredient){
            System.out.println(ingredient.howToMeasure() + ingredient.getDescription());
        }
    }
}
