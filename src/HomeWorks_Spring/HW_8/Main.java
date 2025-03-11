package HomeWorks_Spring.HW_8;

public class Main {
    public static void main(String[] args) {


        Employee man = new Employee("MAn", 45,'F', 2500 );

        Employee employee = new Employee("Sergey", 10, 'F', 3700);
        Manager manager = new Manager("Sergey", 78, 'F', 12900,25);
        

        Manager dora = new Manager("Dora", 12, 'M', 123, 10);
//        dora.name = "Dora";
//        dora.age = 29;
//        dora.sex = 'F';
//        dora.salaryDaily = 200;
//        dora.countEmp = 158;

        System.out.println(employee.getSalary(MonthUtils.FULL_YEAR));
        System.out.println(manager.getSalary(MonthUtils.FULL_YEAR));
        System.out.println(dora.getMonthlySelary(MonthUtils.FEBRUARY));
        System.out.println(dora.getSalary(MonthUtils.FULL_YEAR));



    }

}
