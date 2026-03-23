package com.Task1.BankAccountSystem;

public class MainClass {

	public static void main(String[] args) {
		
		BankAccount bankAccount1 = new BankAccount(1010101, "Venu", 100000);
		BankAccount bankAccount2 = new BankAccount(1010102, "Naveena", 150000);
		
	
		
      
       double deposite = bankAccount1.deposite(50000);
       System.out.println(deposite );
       
       
      bankAccount1.withDraw(20000);
      bankAccount1.checkBalance();
       

       


	}

}
