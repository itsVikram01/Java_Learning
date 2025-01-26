package oops.encapsulation;

public class Main {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount(100);
        System.out.println(bankAccount.getBalance());
        bankAccount.deposit(1000);
        System.out.println(bankAccount.getBalance());
        bankAccount.withdraw(500);
        System.out.println(bankAccount.getBalance());
    }
}
