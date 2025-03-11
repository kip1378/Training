package HomeWorks.Hw8.Ex2;

public class Main {
    public static void main(String[] args) {
        Employee [] employees = {
                new Employee( "Alice", 12000, 1),
                new Employee("Sergei", 15000, 3),
                new Employee("Andrey", 900,0),
                new Employee("Vanya", 900, 1),
        };
        TaxPayment[] taxPayments = TaxCount.CalcTaxForAll(employees);
        for(TaxPayment taxPayment: taxPayments) {
            System.out.println("Name: " + taxPayment.name + ", Tax:" + taxPayment.taxPayment);
        }
    }

}
