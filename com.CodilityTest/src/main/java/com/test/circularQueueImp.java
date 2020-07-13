package com.test;

import java.util.Arrays;

public class circularQueueImp <E>{
	public static void main(String[] args) throws Exception {
		circularQueueImp<Integer> circularQ = new circularQueueImp<Integer>(5);
		circularQ.enQueue(289);
		circularQ.enQueue(300);
		circularQ.enQueue(266);
		circularQ.enQueue(250);
		circularQ.enQueue(234);
		circularQ.deQueue();
		
		System.out.println("Circular Queue is : " + circularQ);
	}
	

	@Override
	public String toString() {
		return "circularQueueImp [queue=" + Arrays.toString(queue) + ", head=" + head + ", tail=" + tail
				+ ", queueSize=" + queueSize + "]";
	}


	private E[] queue;
	private int head;
	private int tail;
	private int queueSize;
	
	circularQueueImp(int size){
		queue = (E[])new Object[size];
		head = -1;
		tail = -1;
		queueSize = 0;
	}
	
	private E deQueue() throws Exception{
		if(isEmpty()) {
			throw new Exception("The queue is Empty, no elements can be dequeued");
		}
		E deQueueElement = queue[head];
		queue[head] = null;
		head = (head+1)%queue.length;
		queueSize--;
		return deQueueElement;
	}
	
	private void enQueue(E item) throws Exception{
		if(isFull()) {
			throw new Exception("the queue is full no element can be inserted");
		}
		tail = (tail+1)%queue.length;
		queue[tail] = item;
		queueSize++;
		
		if(head == -1) {
			head++;
		}
	}
	
	private boolean isFull(){
		if(queue.length == queueSize) {
			return true;
		} else {
			return false;
		}		
	}
	
	private boolean isEmpty() {
		if(queueSize == 0) {
			return true;
		} else {
			return false;
		}
	}
	
	

}
