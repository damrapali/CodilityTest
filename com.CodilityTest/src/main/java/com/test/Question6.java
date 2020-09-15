package com.test;

import java.util.Enumeration;
import java.util.Scanner;
import java.util.Vector;

public class Question6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a character you want to add in vector:  ");
		
		
		char ch = sc.next().charAt(0);
		Vector vec = new Vector();
		editVector(vec , ch);
	}
	
	public static void editVector(Vector vec , char ch) {		
		
		vec.add("T");
		vec.add("e");
		vec.add("k");
		vec.add("a");
		vec.add("r");
		vec.add("c");
		vec.add("h");
		
		vec.insertElementAt(ch, 3);
		vec.insertElementAt(ch, 4);
		vec.insertElementAt(ch, 5);
		vec.insertElementAt(ch, 6);
		vec.insertElementAt(ch, 7);
		
		System.out.println(vec);
		
		int count = 0;
		for(int i=0; i<vec.size(); i++) {
			if(i>=6) {
			vec.remove(i);
			i--;
			count++;
			if(count == 5)
				break;
			}
		}
		
		
		System.out.println(vec.toString());
	
	}
}
