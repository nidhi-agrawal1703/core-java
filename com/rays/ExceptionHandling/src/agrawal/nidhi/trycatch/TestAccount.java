package agrawal.nidhi.trycatch;

public class TestAccount {
	
	public static void main(String[] args) throws InsufficientBalanceException {
		
		Account a=new Account();
		int b;
		a.setBalance(5000);
		b=a.getBalance();
		System.out.println(b);
		
		a.withdraw(10000);
	}
}
