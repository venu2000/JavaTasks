package com.Task1.BankAccountSystem;

import java.util.Objects;

public class BankAccount {
	
	private long accountNumber;
	private String accountHolderName;
	private double balance;
	
	
	public BankAccount(long accountNumber, String accountHolderName, double balance) {
		
		this.accountNumber = accountNumber;
		this.accountHolderName = accountHolderName;
		this.balance = balance;
	}


	public long getAccountNumber() {
		return accountNumber;
	}


	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}


	public String getAccountHolderName() {
		return accountHolderName;
	}


	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}


	public double getBalance() {
		return balance;
	}


	public void setBalance(double balance) {
		this.balance = balance;
	}


	@Override
	public int hashCode() {
		return Objects.hash(accountHolderName, accountNumber, balance);
	}
	
	
	//------------Deposite Logic
	public double deposite(double deposite) {
		balance = balance+ deposite;
		return balance;
		
		
	}
	
	//-------------withdraw logic
	public void withDraw(double withdraw) {
		 balance = balance - withdraw;
		 System.out.println( "withdrawed amount is : " + withdraw );
		 
		
	}
	
	
	public void checkBalance() {
		System.out.println("Your Current Balance is: " + balance);
	}
	
	
	
	
	


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BankAccount other = (BankAccount) obj;
		return Objects.equals(accountHolderName, other.accountHolderName) && accountNumber == other.accountNumber
				&& Double.doubleToLongBits(balance) == Double.doubleToLongBits(other.balance);
	}


	@Override
	public String toString() {
		return "BankAccount [accountNumber=" + accountNumber + ", accountHolderName=" + accountHolderName + ", balance="
				+ balance + "]";
	}
	
	
	
	
	
	
	
	
	
	
	

}
