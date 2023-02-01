package com.app.account;

public class SavingsAccount extends Account{	

	
	public SavingsAccount(int accno,double accbal)
	{
		super (accno,accbal);
		
	}

	public void deposit(double amt)
	{
		System.out.println("Your deposit amount is = "+amt);
		accbal=accbal+amt;
		System.out.println("Your Savings Account Balance is = "+accbal);
	}
	public void  withdraw(double amt)
	{
		System.out.println("Your withdrawl amount is = "+amt);
		accbal=accbal-amt;
		System.out.println("Your Savings Account Balance is = "+accbal);
	}

}
