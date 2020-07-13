package com.test;

import java.util.ArrayList;

public class Question8 {

	public static void main(String[] args) {
		ArrayList<Object> al = new ArrayList<Object>();
		al.add("Briana");
		al.add("Briana");
		al.add("Naitely");
		al.add("Nethan");
		al.add("Nethan1");
		al.add("Nethan2");
		al.add("Nethan3");
		al.add("Nethan");
		
		for(int i =0; i< al.size();i++) {
			for(int j =i+1;j<al.size();j++) {
				if(al.get(i).equals(al.get(j))) {
					al.remove(j);					
				}
			}
		}
		
		System.out.println("List of employee after removing duplicates:  " + al);
		
	}

}

class Employee{
	String name;
	public Employee(String name) {
		this.name = name;
	}
}
