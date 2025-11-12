package agrawal.nidhi.collectionbasic;

import java.util.Enumeration;
import java.util.Vector;

public class TestFailSafe {
	
	public static void main(String[] args) {
		
		Vector v=new Vector();
		
		v.add("Orange");
		v.add("Mango");
		v.add("Banana");
		v.add("Apple");
		
		System.out.println("--Vector--:"+v);
		
		System.out.println("----Enumeration-----------");
		Enumeration e=v.elements();
		//fail safe
		v.add("Kiwi");
		while(e.hasMoreElements()) {
			Object o=e.nextElement();
			System.out.println(o);
		}
		
	}
}
