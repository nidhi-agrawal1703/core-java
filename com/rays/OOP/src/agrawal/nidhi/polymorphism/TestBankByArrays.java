package agrawal.nidhi.polymorphism;

public class TestBankByArrays {
	
	public static void main(String[] args) {
		
		Bank[] b=new Bank[3];
		b[0]=new AxisBank();
		b[1]=new HDFCBank();
		b[2]=new ICICIBank();
		
		for(int i=0;i<b.length;i++) {
			System.out.println(b[i].getName());
			System.out.println(b[i].interestRate());
		}
		
		
	}
}
