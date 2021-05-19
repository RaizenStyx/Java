/**
 * Main
 * Desc: Creates bank account object and tries to withdraw until exception
 * is thrown.
 * Created By: Connor Reed on 4/8/2021
 */


package cs2.labs.lab06;


public class ExceptionsExample {
    public static void main(String[] args) {
        BankAccount acct = new BankAccount();

        acct.deposit(100.00);
        System.out.println("Deposited 100. New balance = " + acct.getBalance());

        try {
            for (int i = 0; i < 5; i++) {
                acct.withdraw(25);
                System.out.println("Withdrew 25. New balance = " + acct.getBalance());
            }
        } catch (InsufficientFundsException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Balance after exception = " + acct.getBalance());
    }
}
