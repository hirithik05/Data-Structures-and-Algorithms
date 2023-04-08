package Collections;

import java.util.ArrayDeque;

public class Array_Deque {
	public static void main(String[] args) {
		ArrayDeque<Integer>obj = new ArrayDeque();
		//Add element from first end
		obj.offerFirst(1);
		//Add element from last end
		obj.offerLast(4);
		obj.offerLast(2);
		obj.offerLast(78);
		obj.pollFirst();
		obj.pollLast();
		System.out.println(obj);
		
	}

}
