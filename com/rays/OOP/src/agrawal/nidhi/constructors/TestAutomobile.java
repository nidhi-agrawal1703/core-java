package agrawal.nidhi.constructors;


public class TestAutomobile {
	
	public static void main(String[] args) {
		
		Automobile a =new Automobile("REd", 50, "SUV");
		a.breakSpeed();
		System.out.println(a.getSpeed());
		a.accelerator();
		System.out.println(a.getSpeed());
		
		

	
	}
	
	}
