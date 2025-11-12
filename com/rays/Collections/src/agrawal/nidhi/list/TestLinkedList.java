package agrawal.nidhi.list;

//LinkedList stores value and reference,both.It doesn't contain duplicate elements. 
import java.util.LinkedList;

public class TestLinkedList {
	
	public static void main(String[] args) {
		
		LinkedList list=new LinkedList();
		list.add("Ram");
		list.add("Sita");
		list.add("Laxman");
		list.add("Ravan");
		
		System.out.println("--List--"+list);
		
		//Add element at the top
		list.addFirst("Vishnubhagwan");
		System.out.println("--list--"+list);
		
		//Add element to the last of the list
		list.addLast("Hanuman");
		System.out.println("--list--"+list);
		
		//Add element in the middle of the list
		list.add(2, "Bharat");
		System.out.println("--list--"+list);
		
	}
}
