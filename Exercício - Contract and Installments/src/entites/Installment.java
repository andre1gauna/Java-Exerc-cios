package entites;

import java.util.Date;

public class Installment {

	private double amount;
	private Date dueDate;

	public Installment(double amount, Date dueDate) {
		super();
		this.amount = amount;
		this.dueDate = dueDate;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public Date getDueDate() {
		return dueDate;
	}

	public void setDueDate(Date dueDate) {
		this.dueDate = dueDate;
	}

}
