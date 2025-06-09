package com.rays.basics.assignment;
//Reverse of a 3-digit number

public class Reverse {
	
	public static void main(String[] args) {
		//For eg 123
		int n=456;
		System.out.println(n);
		
		int x=n%100;
		System.out.println(x);
		int last_digit=x%10;
		System.out.println(last_digit);
		
		int second_last=(x-last_digit)/10;
		System.out.println(second_last);
		
		int first_digit=(n-(second_last*10)-last_digit)/100;
		System.out.println(first_digit);
		
		//Reverse of a number is
		int new1=(last_digit*100)+(second_last*10)+first_digit;
		System.out.println(new1);
	}
}
