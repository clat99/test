package com.bank.domain;

public class SavingsAccount extends Account {
	
	double interestRate;
	
	public SavingsAccount() {
		this("",0.0,0.0,0.02);
	}
	public SavingsAccount(String accountNumber, double balance, double amount, double interestRate) {
		super(accountNumber, balance, amount);
		this.interestRate = interestRate;
	}
	
	public double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}
	
	public void calculateInterest() {	
		interestRate = 0.02 * balance;
	}
	
	@Override
	public void deposit() {
		super.deposit();
		balance = interestRate + balance;

	}
}
