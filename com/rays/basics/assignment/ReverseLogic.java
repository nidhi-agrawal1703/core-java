package com.rays.basics.assignment;

public class ReverseLogic {
	public static void main(String[] args) {
		int n=1231;
		int r=0;
		int rn=0;
		
		while(n>0) {
			r=n%10;
			rn=(rn*10)+r;
			n=n/10;
		}
		System.out.println(rn);
	}
}
