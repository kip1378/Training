package HomeWorks.Hw9;

public class SelaryUtils {
    public static int getSum(Employee[] employeeArray){
        int sum = 0;
        for(int i =0; i< employeeArray.length; i++){
            sum += employeeArray[i].getSalary();
        }
        return sum;
    }
}
