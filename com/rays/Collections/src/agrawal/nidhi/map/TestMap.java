package agrawal.nidhi.map;

import java.util.HashMap;
import java.util.Map;

public class TestMap {
	public static void main(String[] args) {
		
		Map m = new HashMap();
		
		m.put("one", 1);
		m.put(2,"two");
		m.put(3, "three");
		m.put(4, "four");
		m.put(5, "five");
		
		System.out.println("Map :"+m);
		System.out.println(m.get(4));
		System.out.println(m.containsKey("one"));
		System.out.println(m.containsValue(1));
		
		System.out.println("Set of keys"+m.keySet());
		System.out.println("Set of values"+m.values());
	}
}
