package agrawal.nidhi.collectionbasic;

import java.util.*;

public class TestCollection {
	
	public static void main(String[] args) {
		
		Collection c1=new ArrayList();
		
		c1.add(45);
		c1.add(4.5);
		c1.add("KGF");
		c1.add('a');
		c1.add(null);
		c1.add(true);
		
		System.out.println("c1 "+c1);
		System.out.println("Does c1 contains KGF: "+c1.contains("KGF"));
		c1.remove(45);
		System.out.println("Collection after remove");
		System.out.println("c1 "+c1);
		System.out.println("----------------");
		
		Collection c2=new ArrayList();
		c2.add(54);
		c2.add(3.2);
		c2.add("KALKI");
		c2.add('b');
		c2.add(false);
		
		System.out.println("c1 "+ c1);
		System.out.println("c2 "+ c2);
		
		c1.addAll(c2);
		System.out.println("After addding");
		System.out.println("c1 "+c1);
		System.out.println("c2 "+c2);
		System.out.println("Does c1 contains c2: " +c1.containsAll(c2));
		c1.removeAll(c2);
		System.out.println("After removing c2 from c1 "+ c1.containsAll(c2)+" "+c1);
		System.out.println("Size of c1: "+ c1.size());
		System.out.println("Is c1 empty: "+c1.isEmpty());
		//Check condition when c1 is not empty !c1.isEmpty()
		c1.clear();
		System.out.println("After clearing c1: "+c1);
		
		
	}
}
