package com.Task4.PaymentSystem;

public class NetBankingPayment implements Payment {

	@Override
	public void pay(double amount) {
		if(amount == 0) {
			System.out.println("Payment Failed");
			System.out.println("PLease Enter amount to make Payment");
		}else {
		System.out.println("Payment Successful");
		System.out.println("Mode : NetBanking");
		System.out.println("Amount "  +amount);
		}
	}
	

}
