package com.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Question2 {

	public static void main(String[] args) {
		
		Student student1 = new Student("Briana", 10001, 68);
		Student student2 = new Student("Andy", 10002, 87);
		Student student3 = new Student("Anna", 10003, 60);
		Student student4 = new Student("Bixy", 10004, 95);
		Student student5 = new Student("Cathy", 10005, 92);
		
		List<Student> students = new ArrayList<Student>();
		students.add(student1);
		students.add(student2);
		students.add(student3);
		students.add(student4);
		students.add(student5);
		
		Collections.sort(students);
		for(Student s: students) {
			System.out.println(s);
		}
		
	}
	
	
}



