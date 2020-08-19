package application;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import entites.Contract;
import entites.Installment;
import services.ContractProcessing;
import services.PaypalService;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter contract data");
		System.out.print("Number: ");
		int id = sc.nextInt();
		System.out.print("Date (dd/MM/yyyy): ");
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Date date =  sdf.parse(sc.next());
		System.out.print("Contract Value: ");
		double value = sc.nextDouble();
		System.out.print("Enter the number o installments: ");
		int installmentsNumber = sc.nextInt();
		System.out.println("Installments:");
		Contract contract = new Contract(id, date, value);
		
		ContractProcessing contractProcessing = new ContractProcessing(installmentsNumber, contract, new PaypalService());
		contract = contractProcessing.installmentProcessing();
		
		for(Installment installment : contract.getInstallments()) {
			System.out.println(sdf.format(installment.getDueDate()) + " - " + installment.getAmount());
		}
		
		sc.close();
	}

}
