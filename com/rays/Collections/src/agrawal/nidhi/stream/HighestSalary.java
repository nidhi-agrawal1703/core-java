package agrawal.nidhi.stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class HighestSalary {
	public static void main(String[] args) {
		List<Integer> list =new ArrayList<Integer>();
		
		list.add(12000);
		list.add(89000);
		list.add(23000);
		list.add(56000);
		list.add(78000);
		list.add(41000);
		
		list.stream().sorted(Collections.reverseOrder()).limit(1).forEach(System.out::println);
		//Print highest salary
		list.stream().sorted(Collections.reverseOrder()).skip(1).limit(1).forEach(System.out::println);
		//Print second highest salary
		list.stream().min(Comparator.naturalOrder()).ifPresent(System.out::println);
		//Prints minimum salary
	}
}
