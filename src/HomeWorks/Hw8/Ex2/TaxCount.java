package HomeWorks.Hw8.Ex2;

public class TaxCount {

     public static TaxPayment[] CalcTaxForAll (Employee[] employees) {
         TaxPayment[] taxPayment = new TaxPayment[employees.length];
         for ( int i = 0; i< employees.length; i++) {
             taxPayment[i] = taxForEmployee(employees[i]);
         }

         return taxPayment;
    }

    public static TaxPayment taxForEmployee (Employee employees){
         double taxebleIncome = employees.salary - employees.children * 1000;
        if ( taxebleIncome < 0) {
            taxebleIncome = 0;
        }
         double taxRate = 0;

         if (taxebleIncome > 10000) {
             taxRate = 0.23;
         } else if (taxebleIncome > 5000){
             taxRate = 0.18;
         } if (taxebleIncome < 5000) {
             taxRate = 0.13;
         }


         TaxPayment taxPayment = new TaxPayment();
         taxPayment.name = employees.name;
         taxPayment.taxPayment = taxebleIncome * taxRate;
         return taxPayment;

    }
}
