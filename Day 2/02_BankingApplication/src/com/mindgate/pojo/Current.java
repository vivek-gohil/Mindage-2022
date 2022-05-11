package com.mindgate.pojo;

public class Current extends Account {
	private double overdraftBalance;

	public Current() {
		System.out.println("Default constrcutor of Current");
	}

	public Current(int accountNumber, String name, double balance, double overdraftBalance) {
		super(accountNumber, name, balance);
		this.overdraftBalance = overdraftBalance;
		System.out.println("Overloaded constrcutor of Current");
	}

	@Override
	public boolean withdraw(double ammount) {
		return false;
	}
	
	@Override
	public boolean deposit(double ammount) {
		return false;
	}

	public double getOverdraftBalance() {
		return overdraftBalance;
	}

	public void setOverdraftBalance(double overdraftBalance) {
		this.overdraftBalance = overdraftBalance;
	}

	@Override
	public String toString() {
		return "Current [overdraftBalance=" + overdraftBalance + ", toString()=" + super.toString() + "]";
	}

}
