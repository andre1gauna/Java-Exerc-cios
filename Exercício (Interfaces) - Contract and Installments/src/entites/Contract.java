package entites;
import java.util.ArrayList;
import java.util.Date;

public class Contract {

	private int idNumber;
	private Date date;
	private double totalValue;
	private ArrayList<Installment> installments = new ArrayList<>();

	public Contract(int idNumber, Date date, double totalValue) {
		super();
		this.idNumber = idNumber;
		this.date = date;
		this.totalValue = totalValue;
	}

	public int getIdNumber() {
		return idNumber;
	}

	public void setIdNumber(int idNumber) {
		this.idNumber = idNumber;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public double getTotalValue() {
		return totalValue;
	}

	public void setTotalValue(double totalValue) {
		this.totalValue = totalValue;
	}
	
	public void addInstallment(double amount, Date dueDate) {
		installments.add(new Installment(amount, dueDate));
	}

	public ArrayList<Installment> getInstallments() {
		return installments;
	}
	
	

}
