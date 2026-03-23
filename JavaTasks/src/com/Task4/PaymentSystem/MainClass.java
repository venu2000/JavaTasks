package com.Task4.PaymentSystem;

public class MainClass {

	public static void main(String[] args) {
	
		
		CreditCardPayment cp = new CreditCardPayment();
		UPIPayment upi = new UPIPayment();
		NetBankingPayment netBP = new NetBankingPayment();
		
		cp.pay(30000);
		System.out.println("=======================");
		upi.pay(500000);
		System.out.println("=======================");
		netBP.pay(000);

	}

}
