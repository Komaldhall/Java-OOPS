package com.kd.bankaccount;

public class BankAccountTest {
	public static void main(String[] args){
		BankAccount ba1= new BankAccount(500,300);
		BankAccount ba2= new BankAccount(700,300);
		
		ba1.deposit(100,1);
		ba1.withdraw(200, 2);
		ba2.deposit(200,2);
		ba2.withdraw(50, 1);
		
		ba2.total();
		System.out.println("Account Number: "+ba1.acc_number+" has total of $"+ba1.total()+" balance");
		System.out.println("So far we have "+BankAccount.acc_count+" number of accounts!");
		
	}
}
