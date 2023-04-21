package com.bank.domain;

public class Account {
	
	private String accountNumber;
	double balance;
	private double amount;
	
	public Account() {
		this("",0.0,0.0);
	}
	
	public Account(String accountNumber, double balance, double amount) {
		this.accountNumber = accountNumber;
		this.balance = balance;
		this.amount = amount;
	}
	
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	@Override
	public String toString() {
		return "Account [accountNumber=" + accountNumber + ", balance=" + balance + ", amount=" + amount + "]";
	}
	
	public void deposit() {
		this.balance = this.balance + this.amount;
	}
	
	public void withdraw() {
		this.balance = this.balance - this.amount;
	}

}
