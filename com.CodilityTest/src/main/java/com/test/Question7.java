package com.test;


public class Question7 {
	
	// Write a java program to implement your own ArrayList 
	//which has two methods a) add b) remove and store 5 student information in your ArrayList.
	
	public static void main(String[] args) {
		MyArrayList arr1 = new MyArrayList();
		
		arr1.add(2);
		arr1.add(3);
		 
	}
}

class MyArrayList{	
	
	public int[] dataStore;
	public int actualSize;
	
	public MyArrayList() {
		dataStore = new int[actualSize];
	}
	
	public void add(int data) {
			actualSize += 1;
			int index = actualSize;
			dataStore[index] = data;
			//actualSize = actualSize+1;		 
	}
}

class Stu{
	String name;
	int rollNo;
	int score;
	
	public Stu(String name, int rollNo, int score){
		this.name = name;
		this.rollNo = rollNo;
		this.score = score;
	}
}

