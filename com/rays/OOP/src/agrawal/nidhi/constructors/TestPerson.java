package agrawal.nidhi.constructors;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestPerson {
	
	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
		Person p=new Person("Nidhi","Indore",sdf.parse("23-09-2001"));
		
		System.out.println(p.getDob());
		System.out.println("Your age is "+ p.getAge());
	}

}
