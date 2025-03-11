package HomeWorks_Spring.HW_8;

public class Manager {
    private String name;
    private int age;
    private char sex;
    private double salaryDaily;
    private int countEmp;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public char getSex() {
        return sex;
    }

    public double getSalaryDaily() {
        return salaryDaily;
    }

    public int getCountEmp() {
        return countEmp;
    }

    public Manager(String name, int age, char sex, double salaryDaily, int countEmp) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.salaryDaily = salaryDaily;
        this.countEmp = countEmp;
    }

    public void setSalaryDaily(double salaryDaily) {
        this.salaryDaily = salaryDaily;
    }

    public void setCountEmp(int countEmp) {
        this.countEmp = countEmp;
    }

    public double getSalary(Month[] months) {
        double salary = 0;
        for (Month month : months) {
            salary += getMonthlySelary(month);
        }

        return salary;
    }


    public double getMonthlySelary(Month month){
        double bonus = 1 + countEmp * 0.01;
        return month.getWeekDays() * salaryDaily * bonus;

    }
}
