package agrawal.nidhi.generics;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestEmployeeGenerics {

	public static void main(String[] args) {
		
		List<Employee> list=new ArrayList<Employee>();
		
		list.add(new Employee(1,"Ram","Indore"));
		list.add(new Employee(2,"Shyam","Bhopal"));
		list.add(new Employee(3,"Pawan","Ujjain"));
		list.add(new Employee(4,"Kamal","Mumbai"));
		
		System.out.println("Employee List: "+list);
		
		//Iterating list through iterator
		Iterator<Employee> it=list.iterator();
		while(it.hasNext()) {
			Employee e=it.next();
			System.out.println(e);
		}
	}
}
