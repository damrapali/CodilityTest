package com.test;

public class StackImp {
	
	int size;
	int arr[];
	int top;	
	
	StackImp(int size) {
		this.size = size;
		this.arr = new int[size];
		this.top = -1;		
	}
	
	public boolean isEmpty() {
		return (top == -1);		
	}
	
	public boolean isFull() {
		return (size-1 == top);
	}
	
	public void push(int element) {
		if(!this.isFull()) {
		top++;		
		arr[top] = element;
		System.out.println("Pushed element is :  " + element);
		} else {
		System.out.println("Stack is fulll");
		}
	}
	
	public int pop() {
		if(!this.isEmpty()) {
		int temptop = top;		
		top--;		
		System.out.println("Popped element :" + arr[temptop]);
		return arr[temptop];
		} else {
			
			System.out.println("Its empty");
			return -1;
		}
	}
	
	public int peek() {
		if(!this.isEmpty()) {
			return arr[top];
		} else {
			return -1;
		}
	}
	
	public static void main(String[] args) {
		StackImp StackCustom = new StackImp(10);
		//StackCustom.pop();
		System.out.println("=================");
		StackCustom.push(10000);
		StackCustom.push(30);
		StackCustom.push(50);
		StackCustom.push(40);
		System.out.println("=================");
		StackCustom.pop();
		StackCustom.pop();
		StackCustom.pop();
		StackCustom.pop();
		StackCustom.isEmpty();
		System.out.println("=================");
	}

}
