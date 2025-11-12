package agrawal.nidhi.classobject;

public class TestAccount {
	public static void main(String[] args) {
		
		Account a1=new Account();
		a1.setbalance(5000.00);
		a1.setAccNumber("456231");
		a1.setAccounttype("Saving");
		
		a1.withdraw(6000.00);
		a1.deposit(1000.00);
		a1.withdraw(6000.00);
		System.out.println(a1.getBalance());
	}
}
