package agrawal.nidhi.queue;

import java.util.ArrayDeque;
import java.util.Queue;

//Queue is an interface that follows First in First Out principle.
public class TestQueue {
	
	public static void main(String[] args) {
		
		Queue q=new ArrayDeque();
		
		//Add element to rear of the queue
		for(char c='a';c<='z';c++) {
			q.offer(c);
		}
		System.out.println("Queue :"+q);
		
		//REturns the element from the front of queue without deleting it
		System.out.println(q.peek());
		
		//Returns the element from the front of the queue and deleting it
		System.out.println(q.poll());
		
		//Iterating through the queue
		while(!q.isEmpty()) {
			System.out.println(q.poll());
		}
	}
}
