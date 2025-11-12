package agrawal.nidhi.generics;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class TestGenerics {
	
	public static void main(String[] args) {
		
		List<Integer> list=new ArrayList<Integer>();
		list.add(5);
		list.add(45);
		list.add(15);
		
		Set<String> s=new HashSet<String>();
		s.add("Ram");
		s.add("Shyam");
		
		Map<Integer, String> m=new HashMap<Integer,String>();
		m.put(1, "Ram");
		m.put(2, "Shyam");
	}
}
