package com.Task4.PaymentSystem;

public class CreditCardPayment implements Payment{

	@Override
	public void pay(double amount) {
		System.out.println("Payment Successful");
		System.out.println("Mode : CrediCard");
		System.out.println("Amount "  +amount);
		
	}

}
