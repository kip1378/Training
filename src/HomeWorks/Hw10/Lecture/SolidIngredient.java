package HomeWorks.Hw10.Lecture;

public class SolidIngredient extends Ingredient {

    public SolidIngredient(String name, double weightInKg) {
        super(name, weightInKg + " kg");

    }

    @Override
    public String howToMeasure() {
        return "weight on a scale";
    }
}
