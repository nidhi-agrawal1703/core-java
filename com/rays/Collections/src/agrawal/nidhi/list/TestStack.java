package agrawal.nidhi.list;

import java.util.Stack;

//First In Last Out(FILO)
//Last in First Out(LIFO)
public class TestStack {
	public static void main(String[] args) {
		
		Stack s=new Stack();
		
		//Adding elements to stack
		for(char c='a';c<='z';c++) {
			s.push(c);
		}
		System.out.println("--Stack--"+s);
		
		//Peek method returns object at top of the stack,it doesn't modifies the stack.
		//It allows you to examine the top-most element of the stack.
		System.out.println(s.peek());
		System.out.println("--Stack after peek--"+s);
		
		//Pop method modifies and removes the element at top of the stack
		System.out.println(s.pop());
		System.out.println("--Stack after pop--"+s);
		
		
	}
}
