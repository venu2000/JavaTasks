package com.Task4.PaymentSystem;

public class UPIPayment implements Payment {

	@Override
	public void pay(double amount) {
		System.out.println("Payment Successful");
		System.out.println("Mode : UPI");
		System.out.println("Amount "  +amount);
		
	}

}
