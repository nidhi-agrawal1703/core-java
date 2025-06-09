package com.rays.basics.assignment;
//Checks whether a 3 digit number is armstrong or not
public class Armstrong {
	public static void main(String[] args) {
		int n=153;
		
		//Code to get digits of a number
		int x=n%100;
		//System.out.println(x);
		int last_digit=x%10;
		//System.out.println(last_digit);
		
		int second_last=(x-last_digit)/10;
		//System.out.println(second_last);
		
		int first_digit=(n-(second_last*10)-last_digit)/100;
		//System.out.println(first_digit);
		
		//Code to check for armstrong number
		int c=(first_digit*first_digit*first_digit)+(second_last*second_last*second_last)+(last_digit*last_digit*last_digit);
		if(c==n) {
			System.out.println("Number is armstrong");
		}
		else {
			System.out.println("Number is not armstrong");
		}
		
	}
}
