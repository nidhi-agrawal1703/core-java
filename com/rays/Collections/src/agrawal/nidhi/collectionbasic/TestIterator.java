package agrawal.nidhi.collectionbasic;

import java.util.ArrayList;
import java.util.Iterator;

public class TestIterator {
	
	public static void main(String[] args) {
		
		ArrayList list=new ArrayList();
		
		//add elements to the list
		list.add("Ram");
		list.add("Sita");
		list.add("Laxman");
		list.add("Ravan");
		list.add("Ravan");
		list.add("Ravan");
		list.add(null);
		list.add(null);
		
		System.out.println("---List--"+list);
		
		//Iteration through loop
		for(Object o:list) {
			System.out.print("\t"+o);
		}
		
		//Iteration through iterator
		Iterator it=list.iterator();
		while(it.hasNext()) {
			Object o=it.next();
			System.out.println("Iterating through iterator: "+o);
		}
		
		//Foreach method
		list.forEach(System.out::println);
	}
}
