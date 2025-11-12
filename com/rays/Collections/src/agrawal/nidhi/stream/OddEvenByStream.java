package agrawal.nidhi.stream;

import java.util.*;

public class OddEvenByStream {
	
	public static boolean isOdd(int e) {
		if(e%2!=0) {
			return true;
		}else {
			return false;
		}
	}

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<Integer>();
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		list.add(7);
		list.add(8);

		list.stream().filter(e -> e % 2 == 0).forEach(e -> System.out.println("Even: " + e));
		list.stream().filter(e->isOdd(e)).forEach(e-> System.out.println("odd: "+e));
	}
}
