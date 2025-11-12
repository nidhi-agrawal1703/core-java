package agrawal.nidhi.LocalDate;

import java.util.Calendar;

public class DateMaintenance {
	public static void main(String[] args) {
		Calendar c=Calendar.getInstance();
		
		for(int a=1;a<=12;a++) {
			c.add(Calendar.DATE, 31);
			System.out.println(c.getTime());
		}
	}
}
