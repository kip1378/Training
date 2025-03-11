package HomeWorks.Hw9;

public class Employee extends Person {


    private int salary;

    public Employee(String name, int age, char gender) {
        super(name, age, gender);
    }

    public Employee(String name, int age, char gender, int salary) {
        super(name, age, gender);
        this.salary = salary;
    }


    public int getSalary() {
        return salary;
    }

    public boolean isSameName(Employee employee){
        return this.getName().equals(employee.nameWithoutPrefix());
    }
}
