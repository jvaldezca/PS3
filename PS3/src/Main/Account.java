package Main;

import java.util.Date;

public class Account {
	// Private attributes
	private int id;
	private double balance;
	private double annualInterestRate;
	private Date dateCreated;

	// No-arg constructor to create default account
	public Account() {
		this.id = 0;
		this.balance = 0;
		this.annualInterestRate = 0;
		this.dateCreated = new Date();
	}

	// Constructor for specified id and initial balance
	public Account(int id, double balance) {
		this.id = id;
		this.balance = balance;
		// Creating a new account so you need a date
		this.dateCreated = new Date();
	}

	// Accessor and mutator methods for id, balance, and annualInterestRate
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getAnnualInterestRate() {
		return annualInterestRate;
	}

	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}

	// Accessor method for dateCreated
	public Date getDateCreated() {
		return dateCreated;
	}

	// Method that returns the monthly interest rate
	public double getMonthlyInterestRate() {
		return (this.annualInterestRate / 12);

	}

	// Method that withdraws money from account
	public void withdraw(double amount) throws InsufficientFundsException {
		if (amount <= balance) {
			this.balance -= amount;
		} else {
			double needs = amount - balance;
			throw new InsufficientFundsException(needs);
		}
	}

	// Method that deposits money into the account
	public void deposit(double amount) {
		this.balance -= amount;
	}

}