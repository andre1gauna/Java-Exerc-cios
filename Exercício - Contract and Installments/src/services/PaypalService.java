package services;

import interfaces.PaymentService;

public class PaypalService implements PaymentService{

	@Override
	public double TaxService(double amount, int installments) {
		
		return (amount * (1+ (0.01 * installments)) * 1.02);
	}		

}
