package com.bank.domain;


public class CheckingAccount extends Account{
	double overdraftLimit;
	int penalty; 
	
	public CheckingAccount() {
		this("",0.0,0.0,0.0);
	}

	public CheckingAccount(String accountNumber, double balance, double amount, double overdraftLimit) {
		super(accountNumber, balance, amount);
		this.overdraftLimit = overdraftLimit;
	}

	public double getOverdraftLimit() {
		return overdraftLimit;
	}

	public void setOverdraftLimit(double overdraftLimit) {
		this.overdraftLimit = overdraftLimit;
	}
	
	@Override
	public void withdraw()
	{
		if(balance < 0.0)
			{ penalty=20;
			  balance = balance - penalty;
			} 
	}
	
	

}