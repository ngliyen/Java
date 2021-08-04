package com.liyen.bankaccount;
import java.util.Random;


public class BankAccount {
	private double checkingBalance;
	private double savingsBalance;
	private static int numAccounts = 0;
	private static double totalBalance = 0;
	private String accountNo;

	public BankAccount() {
		checkingBalance = 0;
		savingsBalance = 0;
		accountNo = generateAccountNo();
		numAccounts++;
		// TODO Auto-generated constructor stub
	}
	
	// getter
	public double getCheckingBalance() {
		return checkingBalance;
	}
	
	// getter
	public double getSavingsBalance() {
		return savingsBalance;
	}
	
	// getter
	public String getAccountNo() {
		return accountNo;
	}
	
	// getter
	public static int getNumAccounts() {
		return numAccounts;
	}
	
	// getter
	public static double getTotalBalance() {
		return totalBalance;
	}
	
	
	// setter
	public void deposit(double amount, String accountType) {
		accountType = accountType.toLowerCase();
		if (accountType == "savings") {
			this.savingsBalance += amount;
			BankAccount.totalBalance += amount;
		}
		else if (accountType == "checking") {
			this.checkingBalance += amount;
			BankAccount.totalBalance += amount;
		}
	}
	
	// setter
	public void withdraw(double amount, String accountType) {
		accountType = accountType.toLowerCase();
		if (accountType == "savings") {
			if (this.savingsBalance >= amount) {
				this.savingsBalance -= amount;
				BankAccount.totalBalance -= amount;
			} else {
				System.out.println("You do not have sufficient balance in your savings account.");
			}
		}
		else if (accountType == "checking") {
			if (this.checkingBalance >= amount) {
				this.checkingBalance -= amount;
				BankAccount.totalBalance -= amount;
			} else {
				System.out.println("You do not have sufficient balance in your checking account.");
			}
			
		}
		else {
			System.out.println("You have specified the wrong account type");
		}
	}
	
	// getter
	public double getAccountBalance() {
		return getCheckingBalance() + getSavingsBalance();
	}
	
	private String generateAccountNo() {
		String accountNo = "";
		for (int i=0; i<8; i++) {
			accountNo += getRandomNumber(); 
		}
		return accountNo;
		
	}
	
	private char getRandomNumber() {
	    char[] digits = new char[10];
	    // create an array with 26 alphabets
	    for (int i=0; i<10; i++){
	      digits[i] = (char)(48+i);
	      // System.out.println(alphabets[i]);
	    }
	    Random randMachine = new Random();
	    return digits[randMachine.nextInt(10)];
	}
	
	

}
