package agrawal.nidhi.classobject;

public class Account {
	
	private String accNumber;
	private String accountType;
	private double balance;
	
	public void setAccNumber(String accNumber) {
		this.accNumber=accNumber;
	}
	public String getAccNumber() {
		return this.accNumber;
	}
	
	public void setAccounttype(String accountType) {
		this.accountType=accountType;
	}
	public String getAccountType() {
		return this.accountType;
	}
	
	public void setbalance(double balance) {
		this.balance=balance;		
	}
	public double getBalance() {
		return this.balance;
	}
	
	public void deposit(double amount) {
		this.balance=this.balance+amount;
	}
	public void withdraw(double amount) {
		
		if(this.balance>=amount) {
			this.balance=this.balance-amount;
		}
		else {
			System.out.println("Insufficient funds");
		}
	}
}
