package agrawal.nidhi.constructors;

public class Account {
	
	private String accNumber;
	private String accountType;
	private double balance;
	
	public Account(String accNumber,String accountType,double balance) {
		this.accNumber=accNumber;
		this.accountType=accountType;
		this.balance=balance;
	}
	
	public String getAccNumber() {
		return this.accNumber;
	}
	
	public String getAccountType() {
		return this.accountType;
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
