package com.rays.basics.assignment;

public class DivisibilityBy7 {

	public static void main(String[] args) {
		
		int n=497;
		
		//Isolate the last digit
		int last_digit=n%10;
		//System.out.println(last_digit);
		
		//Double the last digit
		int d=last_digit*2;
		
		//Subtract from remaining digits
		int x=n/10;
		//System.out.println(x);
		int y=x-d;
		//System.out.println(y);
		
		//Check if the result is divisible by 7
		if(y%7==0) {
			System.out.println("Number is divisible by 7: "+n);
		}else {
			System.out.println("Number is not divisible by 7: "+n);
		}
	}
}
