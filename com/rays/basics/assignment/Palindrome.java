package com.rays.basics.assignment;

//Checks whether a 3-digit number is palindrome or not 

public class Palindrome {
	public static void main(String[] args) {
		//For eg n=121
		int n=131;
		
		int x=n%100;
		//System.out.println(x);
		int last_digit=x%10;
		//System.out.println(last_digit);
		
		int second_last=(x-last_digit)/10;
		//System.out.println(second_last);
		
		int first_digit=(n-(second_last*10)-last_digit)/100;
		//System.out.println(first_digit);
		
		//Reverse of a number is
		int new1=(last_digit*100)+(second_last*10)+first_digit;
		//System.out.println(new1);
		
		if(n==new1) {
			
			System.out.println("Number is palindrome: "+n);
		}else {
			System.out.println("Number is not palindrome:"+n);
		}
	}
}
