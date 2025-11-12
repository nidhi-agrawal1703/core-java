package agrawal.nidhi.set;

//Set does not contain duplicate values
//Set does not contain null values
//Order of set is sorting order

import java.util.*;

public class TestSet {

	public static void main(String[] args) {
		
		Set s=new HashSet();
		s.add(3);
		s.add(1);
		s.add(2);
		System.out.println(s);
		
		Set s1=new HashSet();
		s1.add('d');
		s1.add('A');
		s1.add('e');
		s1.add('c');
		s1.add('g');
		s1.add('B');
		System.out.println(s1);//by default hashset prints in ascending order
		
	}
}
