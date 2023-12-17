//Modify class Account to provide a method called debit that withdraws moneyfrom an Account.
// Ensure that the debit amount does not exceed the Account’s balance. If it does, the balance should be
//left unchanged and the method should print a message indicating ―Debit amount exceeded account balance.
//Modify class AccountTest to test method debit.
import java.util.Scanner;

class Accountt {
    double debit;
    double balance;

    public Accountt(double debit, double balance) {
        this.debit = debit;
        this.balance = balance;
    }

    public void debit() {
        if (balance >= debit) {
            balance -= debit;
            System.out.println("Amount is debited. Remaining balance:" + balance);
        } else {
            System.out.println("Insufficient balance");
        }
    }
}

public class Account {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the initial balance: ");
        double initialBalance = sc.nextDouble();

        System.out.print("Enter the debit amount: ");
        double debitAmount = sc.nextDouble();

        Accountt account = new Accountt(debitAmount, initialBalance);

        account.debit();
    }
}
