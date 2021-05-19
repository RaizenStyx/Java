/**
 * Bank account class with exception
 */

package cs2.labs.lab06;

public class BankAccount {
    private double balance;

    public BankAccount() {
        this.balance = 0;
    }

    public void deposit(double amount) {
        this.balance += amount;
    }

    public void withdraw(double amount) throws InsufficientFundsException {
        if (Double.compare(this.balance, amount) < 0) {
           throw new InsufficientFundsException();
        }

        this.balance -= amount;
    }

    public double getBalance() {
        return this.balance;
    }
}
