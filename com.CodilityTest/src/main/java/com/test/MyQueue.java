package com.test;

import java.util.Stack;

public class MyQueue {

	public static void main(String[] args) {
		CustomQueue	queue = new CustomQueue();
		queue.enQueue(23);
		queue.enQueue(22);
		queue.enQueue(26);
		queue.enQueue(29);
		
		System.out.println(queue.deQueue());
	}
	
}
class CustomQueue {	

	Stack<Integer> stack1 = new Stack<Integer>();
	Stack<Integer> stack2 = new Stack<Integer>();
	
	public void enQueue(int x) {
		while(!stack1.isEmpty()) {
			stack2.push(stack1.pop());
		}
		
		stack1.push(x);
		
		while(!stack2.isEmpty()) {
			stack1.push(stack2.pop());
		}
	}
	
	public int deQueue() {
		if(stack1.isEmpty()) {
			System.out.println("Queue is Empty");
			System.exit(0);
		} 
			int topElement = stack1.peek();
			stack1.pop();			
			return topElement;		
	}
}
