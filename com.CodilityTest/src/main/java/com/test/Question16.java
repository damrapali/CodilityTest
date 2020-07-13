package com.test;

public class Question16 {
	
	public static void main(String[] args) {
		task task1 = new task();
		task task2 = new task();
		task task3 = new task();
		
		Thread thread1 = new Thread(task1, "Thread -1");
		Thread thread2 = new Thread(task2, "Thread -2");
		Thread thread3 = new Thread(task3, "Thread -3");
		
		task2.setPredecessor(thread1);
		task3.setPredecessor(thread2);
		
		thread1.start();
		thread2.start();
		thread3.start();
	}
}

class task implements Runnable{
	
	private Thread predecessor;
	
	public void run() {
		System.out.println(Thread.currentThread().getName() + " started.");
		
		if(predecessor != null) {
			try {
				predecessor.join();
			} catch(InterruptedException e){
				e.printStackTrace();
			}
		}
		
		System.out.println(Thread.currentThread().getName() + " finished.");
		
	}
	
	public void setPredecessor(Thread t) {
		this.predecessor = t;
	}
}
