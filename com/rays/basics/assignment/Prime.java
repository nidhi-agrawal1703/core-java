package com.rays.basics.assignment;

public class Prime {
	
	public static void main(String[] args) {
		int n=129;
		
		if(n%2==0) {
			System.out.println("Number is not prime ");
		}else if(n%3==0) {
			System.out.println("Number is not prime");
		}else if(n%5==0) {
			System.out.println("Number is not prime");
		}else if(n%7==0) {
			System.out.println("Number is not prime");
		}else {
			System.out.println("Number is prime");
		}
	}
}
