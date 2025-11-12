package agrawal.nidhi.list;

import java.util.*;

//List can contain multiple duplicate values
//List can contain multiple null values
//Order of list is natural order

public class TestList {
	
	public static void main(String[] args) {
		
		List l=new ArrayList();
		
		l.add("Ram");
		l.add("Sita");
		l.add("Ravan");
		l.add("Ravan2");
		l.add("Ravan");
		l.add(null);
		l.add(null);
		
		System.out.println("List: "+l);
		System.out.println("Third index and not third value: "+l.get(3));
		System.out.println("Index of value null from the top in list: "+ l.indexOf(null));
		System.out.println("Index of value null from bottom: "+l.lastIndexOf(null));
		l.set(2, "Laxman");
		System.out.println("List after addition: "+l);
		System.out.println("List from index 0 to 2 excluding 2 index"+l.subList(0, 2));
	}

}
