package HomeWorks.Hw6.ex1;

public class Manager {

    double baseSalary;
    String name;
    int numberOfSubordinates;

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfSubordinates() {
        return numberOfSubordinates;
    }

    private void setNumberOfSubordinates(int numberOfSubordinates){
        this.numberOfSubordinates = numberOfSubordinates;
    }

    public double getSalary() {
        if (numberOfSubordinates == 0) {
            return baseSalary;
        } else {
            return getBaseSalary() * getNumberOfSubordinates() / 100 * 3;
        }
    }
    public double getBonus() {
        return getSalary() - getBaseSalary();
    }


}
