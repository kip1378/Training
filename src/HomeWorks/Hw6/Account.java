package HomeWorks.Hw6;

public class Account {
    double balance;

    public void debit(double amount) {
        if (balance < amount) {
            System.out.println("Can't debit more than " + balance);
        } else {
            balance = balance - amount;
        }
    }
}
