package t1;
import java.util.Date;

class Object {
	private int id;
	private double balance;
	private double annualInterestRate;
	private Date dateCreated;
	
	public Object() {
	}
	
	public Object(int newId, double newBalance, double newAnnualInterestRate) {
		id = newId;
		balance = newBalance;
		annualInterestRate = newAnnualInterestRate;
		dateCreated = new Date();
	}
	
	public void setId(int newId) {
		id = newId;
	}
	
	public int getId() {
		return id;
	}
	
	public void setBalance(double newBalance) {
		balance = newBalance;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public void setAnnualInterestRate(double newAnnualInterestRate) {
		annualInterestRate = newAnnualInterestRate;
	}
	
	public double getAnnualInterestRate() {
		return annualInterestRate;
	}
	
	public Date getDateCreated() {
		return dateCreated;
	}
	
	public double getMonthlyInterestRate() {
		return annualInterestRate / 12;
	}
	
	public double getMonthlyInterest() {
		return balance * getMonthlyInterestRate();
	}
	
	public double withdraw(double newWithdraw) {
		return balance >= newWithdraw ? balance -=newWithdraw : 0L;
	}
	
	public void deposit(double newDeposit) { 
		balance += newDeposit ; 
	}
}

public class Account2 {
	public static void main(String[] args) {
		Object newAccount = new Object(1122,20000,4.5);
		
		newAccount.withdraw(2500);
		newAccount.deposit(3000);
		
		System.out.println("balance: $" + newAccount.getBalance());
		System.out.println("monthly interest: " + newAccount.getMonthlyInterest());
		System.out.println("the date when this Account was created is: " + newAccount.getDateCreated());
	}
}
