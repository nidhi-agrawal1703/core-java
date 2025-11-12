package agrawal.nidhi.queue;

import java.util.PriorityQueue;

public class TestPriorityQueue {
	
	public static void main(String[] args) {
		
		PriorityQueue pq=new PriorityQueue();
		
		//Add element to rear of the queue
		pq.offer(5);
		pq.offer(10);
		
		//Iterating through queue
		while(!pq.isEmpty()) {
			System.out.println(pq.poll());
		}
	}
}
