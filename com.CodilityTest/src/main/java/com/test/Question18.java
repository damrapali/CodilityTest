package com.test;

public class Question18 {
		public static Object obj1 = new Object();
	   public static Object obj2 = new Object();
	
	   
	   public static void main(String[] args) {
		
		   Thread1 t1 = new Thread1();
		   Thread2 t2 = new Thread2();
		   t1.start();
		   t2.start();
		   
	}
	
	private static class Thread1 extends Thread {
	      public void run() {
	         synchronized (obj1) {
	            System.out.println("Thread 1: Holding obj 1...");
	            
	            try {
	               Thread.sleep(10);
	            } catch (InterruptedException e) {}
	            System.out.println("Thread 1: Waiting for lock 2...");
	            
	            synchronized (obj2) {
	               System.out.println("Thread 1: Holding lock 1 & 2...");
	            }
	         }
	      }
	   }
	   private static class Thread2 extends Thread {
	      public void run() {
	         synchronized (obj1) {
	            System.out.println("Thread 2: Holding lock 1...");
	           
	            try {
	               Thread.sleep(10);
	            } catch (InterruptedException e) {}
	            System.out.println("Thread 2: Waiting for obj 2...");
	            
	            synchronized (obj2) {
	               System.out.println("Thread 2: Holding obj 1 & 2...");
	            }
	         }
	      }		}
	}


