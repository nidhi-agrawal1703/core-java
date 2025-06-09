package com.rays.basics.assignment;
import java.util.Random;

public class RandomNo {
	public static void main(String[] args) {
		
		Random r= new Random();
		for(int i=1;i<=5;i++) {
			System.out.println(r.nextInt(100));
		}
		
	}
}
