package com.kd.bankaccount;

import java.util.Random;

public class BankAccount {
	public String acc_number="";
	public double check_bal;
	public double sav_bal;

	public static int acc_count=0;
	public static double total_bal;
	
	public double getCheck_bal() {
		
		return this.check_bal;
	}
	public void setCheck_bal(double check_bal) {
		this.check_bal= check_bal;
	}
	public double getSav_bal() {
		return this.sav_bal;
	}
	public void setSav_bal(double sav_bal) {
		this.sav_bal= sav_bal;
	}
	

	public BankAccount(double check_bal, double sav_bal) {
		super();
		
		this.acc_number = randAccountNumber();
		this.check_bal = check_bal;
		this.sav_bal = sav_bal;
		acc_count++;
		total_bal+=this.check_bal+this.sav_bal;
	}
	private String randAccountNumber() {
		Random r= new Random();
		
		for(int i=0; i<10; i++) {
			int rand_num=r.nextInt(9);
			acc_number+=rand_num;
		}
		return acc_number;		
	}
	public void deposit(double money, int cs) {
		
		if (cs == 1) {
			//saving account
			double save=money+getSav_bal();
			setSav_bal(save);
		}
		else if (cs==2) {
			//current account
			double check=money+getCheck_bal();
			setCheck_bal(check);
		}
		
	}
	public void withdraw(double money, int cs) {
		if(cs == 1) {
			//saving account
			if(money>this.sav_bal) {
				System.out.println("You don't have sufficient funds in savings account!!");
			}
			else {
				double sav=getSav_bal();
				double saving=sav-money;
				setSav_bal(saving);
			}
		}
		else if(cs == 2) {
			//current account
			if(money>this.check_bal) {
				System.out.println("You don't have sufficient funds in checking account!!");
			}
			else {
				double check=getCheck_bal();
				double checking=check-money;
				setCheck_bal(checking);
			}
		}
	}
	
	public double total() {
		double tot=getCheck_bal()+getSav_bal();
		System.out.println("Total money you currently have is "+tot);
		return tot;
	}

	
	
}
