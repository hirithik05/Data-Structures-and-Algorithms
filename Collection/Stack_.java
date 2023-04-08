package Collections;

import java.util.Stack;

public class Stack_ {
	public static void main(String[] args) {
		Stack<Integer> obj = new Stack<>();
		//Add element in stack
		obj.push(2);
		obj.push(3);
		obj.push(4);
		obj.push(5);
		//Delete element in stack
		obj.pop();
		//top element of stack
		obj.peek();
		System.out.println(obj);
		
		
	}

}
