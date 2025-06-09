package com.rays.basics.assignment;

public class Fibonacci {

	public static void main(String[] args) {
		
		int a=0;
		int b=1;
		
		for(int i=0;i<7;i++) {
			int x=a;
			int y=b;
			b=a+b;
			a=y;
			System.out.println(a);
			
		}
	}
}
