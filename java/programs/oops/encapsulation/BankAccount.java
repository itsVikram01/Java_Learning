package oops.encapsulation;

public class BankAccount {
    private double balance; // Private attribute to store account balance

    public BankAccount(double initialBalance) { //constructor
        // Validate initial balance (optional)
        this.balance = initialBalance;
    }

    public double getBalance() { // method to return balance/getter method
        return balance;
    }

    public void deposit(double amount) { // method to deposit funds/setter method
        if (amount > 0) {
            balance = balance + amount;
        } else {
            throw new IllegalArgumentException("Amount cannot be negative.");
        }
    }

    public void withdraw(double amount) { // method to withdraw funds/setter method
        if (amount > 0 && amount <= balance) {
            balance = balance - amount;
        } //else {// Handle invalid withdrawal amount (optional)}
    }
}
