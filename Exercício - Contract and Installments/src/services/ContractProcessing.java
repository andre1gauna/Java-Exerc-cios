package services;

import java.util.Calendar;
import entites.Contract;
import interfaces.PaymentService;

public class ContractProcessing {
	
	private int numInstallments;
	private Contract contract;	
	private PaymentService paymentService;

	public ContractProcessing(int numInstallments, Contract contract, PaymentService paymentService) {
		
		this.numInstallments = numInstallments;
		this.contract = contract;
		this.paymentService = paymentService;
	}

	public Contract getContract() {
		return contract;
	}

	public PaymentService getPaymentService() {
		return paymentService;
	}
	
	public Contract installmentProcessing () {
		double amount = contract.getTotalValue()/numInstallments;
		
		for(int i = 0 ; i<numInstallments; i++)
		{
			double installmentValue = paymentService.TaxService(amount,i+1);
			Calendar cal = Calendar.getInstance();
			cal.setTime(contract.getDate());
			cal.add(Calendar.MONTH, i+1);
			contract.addInstallment(installmentValue, cal.getTime());				
		}
		
		return contract;
	}
	
	
	
	

}
