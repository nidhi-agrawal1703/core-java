package agrawal.nidhi.stream;

import java.util.*;

//Stream is not a data structure
//Stream is used to perform operations or filter the collection
//Stream provides pipeline to process data

public class TestStream {
	
	public static void main(String[] args) {
		
		List list=new ArrayList();
		list.add("Ram");
		list.add("Tarun");
		list.add("Shyam");
		list.add("Uday");
		list.add("Tushar");
		list.add("Kamal");
		list.add("Ram");
		
		System.out.println("list: "+list);
		
		list.stream().distinct().forEach(e->System.out.println(e));//Prints distinct elements of a list
		System.out.println("------------");
		list.stream().distinct().sorted().forEach(System.out::println);
		//Prints distinct and sorted list in ascending order
		System.out.println("----------------");
		list.stream().distinct().sorted().map(e->((String) e).toLowerCase()).forEach(System.out::println);
		System.out.println("----------------");
		list.stream().distinct().sorted().map(e->((String) e).toUpperCase()).forEach(System.out::println);
		System.out.println("----------------");
		list.stream().distinct().sorted().map(e->((String) e).toLowerCase()).filter(e->((String) e).startsWith("t")).forEach(System.out::println);
		System.out.println("----------------");
		
	}
}
