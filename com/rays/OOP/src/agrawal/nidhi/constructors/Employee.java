package agrawal.nidhi.constructors;

import java.util.Date;

public class Employee extends Person {

	private String company;
	
	public Employee(String name, String address, Date dob,String company) {
		super(name, address, dob);
		this.company=company;
		
		// TODO Auto-generated constructor stub
	}

}
