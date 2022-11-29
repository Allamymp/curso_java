package entities;

import java.util.Scanner;

public class Bank {
	private String account_holder;
	private double account_balance;
	private int account_number;
	
	Scanner sc = new Scanner(System.in);
	
	public Bank(String account_holder, int account_number) {
		setAccount_holder(account_holder);
		this.account_number = account_number;
		
	}
	
	public Bank(String account_holder, int account_number, double account_movement) {
		setAccount_holder(account_holder);
		this.account_number = account_number;
		setAccount_balance(account_movement);
		
	}
	
	
	
	
	
	
	
	public void  account_data() {

		System.out.println("\nAccount Data:");
		System.out.println("Account " + getAccount_number() 
		                   + "		Holder: " + getAccount_holder()
		                   + "		Balance: $" + getAccount_balance());
	}
	
	public void account_deposit() {
		System.out.println("Enter a deposit value: ");
		double account_movement = sc.nextDouble();
		
		setAccount_balance(account_balance+account_movement);
		System.out.println("Updated Account Data:");
		account_data();
		
	}
	
	public void account_withdraw() {
		System.out.println("\nEnter a withdraw value: ");
		double account_movement = sc.nextDouble();
		
		setAccount_balance(account_balance-account_movement-5);
		System.out.println("Updated Account Data:");
		account_data();
	}
	
	
	

	public String getAccount_holder() {
		return account_holder;
	}

	public double getAccount_balance() {
		return account_balance;
	}

	public int getAccount_number() {
		return account_number;
	}

	public void setAccount_holder(String account_holder) {
		this.account_holder = account_holder;
	}

	public void setAccount_balance(double account_balance) {
		this.account_balance = account_balance;
	}
	
}
