package com.ey.exceptions;

public class AccountOperation {
	
	public static void main(String[] args) {
        BankAccount savingsAccount = new BankAccount(12345, "John Doe", "Savings", 1500);
        System.out.println("Initial balance of savings account: " + savingsAccount.getBalance());
        savingsAccount.deposit(500);
        System.out.println("After deposit: " + savingsAccount.getBalance());
        savingsAccount.withdraw(2000);
        System.out.println("After withdrawal: " + savingsAccount.getBalance());

        BankAccount currentAccount = new BankAccount(54321, "Jane Smith", "Current", 6000);
        System.out.println("Initial balance of current account: " + currentAccount.getBalance());
        currentAccount.deposit(2000);
        System.out.println("After deposit: " + currentAccount.getBalance());
        currentAccount.withdraw(7000);
        System.out.println("After withdrawal: " + currentAccount.getBalance());
    }

}
