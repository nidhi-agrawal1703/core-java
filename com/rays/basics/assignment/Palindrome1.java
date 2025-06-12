package com.rays.basics.assignment;

//Checks whether reverse of a number is equal to itself
public class Palindrome1 {
	public static void main(String[] args) {
		
	
	int n = 222;
	int r = 0;
	int rn=0;
	
	while(n>0) {
		r=n%10;
		rn=(rn*10)+r;
		n=n/10;
	}
	
	if(n==rn) {
		System.out.println("Number is palindrome: "+rn);
	}else {
		System.out.println("Number is not palindrome: "+rn);
	}
}
}