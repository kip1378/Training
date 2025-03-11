package HomeWorks_Spring.HW_8;

public class Employee {
    private String employeeName;
    private int age;
    private char sex;
    private double dailySalary;

    public String getEmployeeName() {
        return employeeName;
    }

    public int getAge() {
        return age;
    }

    public char getSex() {
        return sex;
    }

    public double getDailySalary() {
        return dailySalary;
    }

    public Employee(String employeeName, int age, char sex, double dailySalary) {
        this.employeeName = employeeName;
        this.age = age;
        this.sex = sex;
        this.dailySalary = dailySalary;
    }

    public double getSalary(Month[] months) {
        double salary = 0;
        for (Month month : months) {
            salary += getMonthlySalary(month);
        }

        return salary;
    }

    public double getMonthlySalary(Month month) {
        return month.getWeekDays() * dailySalary;

    }

    public Manager convertToManager(int countEmp) {
     return new Manager(employeeName, age, sex, dailySalary, countEmp);
    }
}