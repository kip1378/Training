package HomeWorks.Hw6;

public class Bank {
    public static void main(String[] args) {
        Account checking = new Account();
        checking.balance = 100;

        Account saving = new Account();
        saving.balance = 1000;

        checking.debit(200);
        System.out.println("Checking balance: " + checking.balance);


        saving.debit(200);
        System.out.println("Checking balance: " + saving.balance);
    }
}
