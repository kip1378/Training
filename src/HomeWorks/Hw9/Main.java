package HomeWorks.Hw9;

public class Main {
    public static void main(String[] args) {


        Employee[] employees = {
                new Employee("Vlad",45,'M',5),
                new Employee("Sergey",32,'M',2),
                new Employee("Anna",12,'F',3)};

        System.out.println(SelaryUtils.getSum(employees));
    }
}
