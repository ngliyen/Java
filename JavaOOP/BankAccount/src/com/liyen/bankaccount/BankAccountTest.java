package com.liyen.bankaccount;

public class BankAccountTest {

	public static void main(String[] args) {
		BankAccount account1 = new BankAccount();
		System.out.println("Account 1: " + account1.getAccountNo());
		account1.deposit(100, "checking");
		account1.withdraw(50, "checking");
//		account1.withdraw(100, "checking");
		System.out.println("Account 1 checking balance: " + account1.getCheckingBalance());
		
		account1.deposit(500, "savings");
		account1.withdraw(50, "savings");
		account1.withdraw(100, "savings");
		System.out.println("Account 1 savings balance: " + account1.getSavingsBalance());
		
		System.out.println("Account 1 balance: " + account1.getAccountBalance());
		
		System.out.println("Total Balance: " + BankAccount.getTotalBalance());
		System.out.println("Total Accounts: " + BankAccount.getNumAccounts());

		System.out.println("---------- Adding a 2nd account ----------");
		BankAccount account2 = new BankAccount();
		System.out.println("Account 2: " + account2.getAccountNo());
		account2.deposit(100, "checking");
		account2.withdraw(50, "checking");
//		account2.withdraw(100, "checking");
		System.out.println("Account 2 checking balance: " + account2.getCheckingBalance());
		
		account2.deposit(500, "savings");
		account2.withdraw(50, "savings");
		account2.withdraw(100, "savings");
		System.out.println("Account 2 savings balance: " + account2.getSavingsBalance());
		
		System.out.println("Account 2 balance: " + account2.getAccountBalance());
		
		System.out.println("Total Balance: " + BankAccount.getTotalBalance());
		System.out.println("Total Accounts: " + BankAccount.getNumAccounts());
		
	}

}
