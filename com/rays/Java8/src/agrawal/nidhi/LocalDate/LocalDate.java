package agrawal.nidhi.LocalDate;

//import java.time.LocalDate;

public class LocalDate {
	public static void main(String[] args) {
		
		java.time.LocalDate today=java.time.LocalDate.now();
		System.out.println("date: "+today);
		System.out.println("Day of month: "+today.getDayOfMonth());
		System.out.println("Day of year: "+today.getDayOfYear());
		System.out.println("Day of week: "+today.getDayOfWeek());
		System.out.println("Month: "+today.getMonth());
		
		java.time.LocalDate dob=java.time.LocalDate.of(2001, 01, 25);
		System.out.println("---------------------");
		System.out.println("dob date: "+dob);
		System.out.println("dob day of month: "+dob.getDayOfMonth());
		System.out.println("dob day of year: "+dob.getDayOfYear());
		System.out.println("dob day of week: "+dob.getDayOfWeek());
		System.out.println("Month: "+dob.getMonth());
		
		System.out.println("Age="+(today.getYear()-dob.getYear()));
	}
}
