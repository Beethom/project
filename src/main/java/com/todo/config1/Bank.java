package com.todo.config1;

/**
 * Hello world!
 *
 */
public class Bank {
	private String firstName;
	private String lastName;
	private String pinNumber;
	private double balance;
	public Bank(String firstName, String lastName, String pinNumber, double balance) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.pinNumber = pinNumber;
		this.balance = balance;
	}
	
	
	public double deposit (double depoAmount, boolean branch) {
		balance += depoAmount;
		return balance;
	}
	public double withdraw(double amount, boolean branch) {
		 balance -= amount;
		 return balance;
		 
	}
	public double getBalance(String pinNumber) {
		if (pinNumber == "1234") {
			return balance;
		
	}
		return balance;

}}
