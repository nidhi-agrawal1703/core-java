package agrawal.nidhi.LocalDate;

import java.time.Period;

public class FindAge {
	public static void main(String[] args) {
		java.time.LocalDate now=java.time.LocalDate.now();
		java.time.LocalDate dob=java.time.LocalDate.of(2001, 01, 25);
		
		Period p=Period.between(now, dob);
		System.out.println(p.getYears()+" years");
	}
}
