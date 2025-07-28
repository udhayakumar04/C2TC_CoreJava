package com.tnsif.dayseven.abstractdemo;

abstract class PaymentGateway{
	public abstract void paymentProcess(double amt);
	
	public void connectToPayment() {		
		System.out.println("Connecting to the Payment Gatway...");
	}
}

class CreditPayment extends PaymentGateway{

	@Override
	public void paymentProcess(double amt) {
		System.out.println("Processing the amount Rs." + amt);
		
	}
}

public class PaymentSystem{
	public static void main(String[] args) {
		PaymentGateway payment;
		
		payment = new CreditPayment();
		payment.connectToPayment();
		payment.paymentProcess(100);
	}
}
