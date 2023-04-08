package Collections;

import java.util.LinkedList;
import java.util.Queue;

public class Queue_ {
	public static void main(String[] args) {
		Queue <Integer> obj = new LinkedList();
		//Add element in Queue
		obj.offer(4);
		obj.offer(5);
		obj.offer(6);
		obj.offer(7);
		//delete element in Queue
		obj.poll();
		//next element to pop
		obj.peek();
		System.out.println(obj);
		
	}

}
