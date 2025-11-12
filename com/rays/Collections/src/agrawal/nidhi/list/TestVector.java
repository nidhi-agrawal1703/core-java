package agrawal.nidhi.list;

import java.util.Enumeration;
//Vector is a legacy class that implements dynamic array.
import java.util.Vector;

public class TestVector {
	public static void main(String[] args) {
		
		Vector v=new Vector();
		
		//Adding elements to vector
		v.add("one");
		v.add(5);
		v.add(true);
		v.add(null);
		v.add(false);
		v.add(null);
		
		System.out.println("--Vector--"+v);
		
		//Enumeration is a legacy class used with other legacy classes only
		Enumeration e=v.elements();
		while(e.hasMoreElements()) {
			Object o=e.nextElement();
			System.out.print("\t"+o);
		}
	}
}
