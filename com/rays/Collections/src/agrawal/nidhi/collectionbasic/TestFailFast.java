package agrawal.nidhi.collectionbasic;

//After loading list in iterator no element can be added to it,
//else it will give an error.This is called as fail-fast
import java.util.*;

public class TestFailFast {
	public static void main(String[] args) {
		
		ArrayList list=new ArrayList();
		
		list.add("Orange");
		list.add("Mango");
		list.add("Banana");
		list.add("Apple");
		
		System.out.println("List: "+list);
		
		System.out.println("------Iterator------");
		Iterator it=list.iterator();
		//fail fast
		list.add("Kiwi");
		System.out.println("List: "+list);
		
		while(it.hasNext()) {
			Object o=it.next();
			//System.out.println(o);
			it.remove();
		}
	}
}
