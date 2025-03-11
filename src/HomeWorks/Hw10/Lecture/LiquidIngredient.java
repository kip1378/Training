package HomeWorks.Hw10.Lecture;

public class LiquidIngredient extends  Ingredient{
    public LiquidIngredient ( String name, int volumeInMl) {
        super(name, volumeInMl + " ml");
    }

    @Override
    public String howToMeasure() {
        return "pour into a cup";
    }
}
