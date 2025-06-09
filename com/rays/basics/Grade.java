package com.rays.basics;

public class Grade {
	public static void main(String[] args) {
		
		int marks=12;
		
		if(marks>=30 & marks<40) {
			System.out.println("Grade E: "+marks);
		}else if(marks>=40 & marks<50) {
			System.out.println("Grade D: "+marks);
		}else if(marks>=50 & marks<60){
			System.out.println("Grade C: "+marks);
		}else if(marks>=60 & marks<80){
			System.out.println("Grade B: "+marks);
		}else if(marks>=80) {
			System.out.println("Grade A: "+marks);
		}else {
			System.out.println("Fail with marks,no grade: "+marks);
		}
		
		
	}
}
