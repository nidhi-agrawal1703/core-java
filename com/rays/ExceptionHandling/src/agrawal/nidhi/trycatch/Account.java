package agrawal.nidhi.trycatch;

public class Account {
	
	public int balance;

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	public void withdraw(double amount) throws InsufficientBalanceException {
		
		if(amount>this.balance) {
			throw new InsufficientBalanceException();
		}else {}
	}
}
