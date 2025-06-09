package com.rays.basics.assignment;

public class Factorial {
	public static void main(String[] args) {
		
		int fact=5;
		for(int i=4;i>0;i--) {
			
			fact=fact*i;
			System.out.println(fact+"="+fact+"*"+i);
		}
		System.out.println(fact);
	}
}
