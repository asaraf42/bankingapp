package com.app.account;

import java.util.Scanner;

public class Bank_Mainclass {
	
	public static void main(String[] args) 
	{
	
		
		Scanner s1=new Scanner(System.in);
		
		SavingsAccount sa=new SavingsAccount(12345,25000.0);
		LoanAccount la=new LoanAccount(34567,10000.0);
		
		System.out.println("Enter :\t1.SavingsAccount\t2.LoanAccount\t3.BalanceEnquiry");
		int choice=s1.nextInt();
		
		if(choice==1)
		{
			
			System.out.println("Enter your 5 digit accno : ");
			int saccno=s1.nextInt();
			if(saccno==12345)
				
			{
				System.out.println("________________________________________________");
				System.out.println("Enter : 1.deposit\t2.withdraw");
				int res=s1.nextInt();
			if(res==1)
			{
			System.out.println("Enter deposit amount : ");
			double amt=s1.nextDouble();
			sa.deposit(amt);
			}
			else if(res==2)
			{
				System.out.println("Enter withdraw amount : ");
				double amt=s1.nextDouble();
				sa.withdraw(amt);
			}
			else
				System.out.println("pls enter valid choice number");
			}
			else
			{
				System.out.println("Ooops!!! invalid savings accno...");
				System.exit(0);
			}
		}
		else if(choice==2)
		{
			System.out.println("Enter your 5 digit accno : ");
			int laccno=s1.nextInt();
			if(laccno==34567)
			{
				System.out.println("________________________________________________");
				System.out.println("Enter : 1.deposit\t2.withdraw");
				int res=s1.nextInt();
			if(res==1)
			{
			System.out.println("Enter deposit amount : ");
			double amt=s1.nextDouble();
			la.deposit(amt);
			}
			else if(res==2)
			{
				System.out.println("Enter withdraw amount : ");
				double amt=s1.nextDouble();
				la.withdraw(amt);
			}
			else
				System.out.println("pls enter valid choice number");
			}
			else
			{
				System.out.println("Ooops!!! invalid loan accno...");
				System.exit(0);
			}
		}

			else if(choice==3)
			{
			System.out.println("Enter 1 Savings Account Balance :\nEnter 2 Loan Account Balance :");
			int res=s1.nextInt();
			
			if(res==1)
			{
				System.out.println("Enter your 5 digit SavingsAccount no : ");
				int res2=s1.nextInt();
				if(res2==12345)
				System.out.println("Your Savings Account Balance is = "+sa.accbal);
				else
					System.out.println("Ooops!!! invalid savings accno...");
					System.exit(0);
			}
			else if(res==2)
			{
				System.out.println("Enter your 5 digit Loan Accountno : ");
				int res2=s1.nextInt();
				if(res2==34567)
				System.out.println("Your Loan Account Balance is = "+la.accbal);
				else
					System.out.println("Ooops!!! invalid loan accno...");
					System.exit(0);
			}
			else
				System.out.println("pls enter valid choice number...!!!");
		}
			else
				System.out.println("pls enter valid choice number...!!!");
	
	}
}


