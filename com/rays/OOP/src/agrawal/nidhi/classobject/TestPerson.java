package agrawal.nidhi.classobject;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class TestPerson {
	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf= new SimpleDateFormat("yyyy-MM-dd");
		
		Person p= new Person();
		p.setName("Ram");
		p.setAddress("Indore");
		p.setDob(sdf.parse("2001-03-12"));
		System.out.println("Age of "+p.getName()+" is "+p.getAge());
		
	
		
		
		
	}
}
