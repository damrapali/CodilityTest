package com.test;

import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class Question1{

	public static void main(String[] args) {
		Map<String, Integer> student = new TreeMap<String, Integer>();
		
		Student student1 = new Student("Briana", 10001);
		Student student2 = new Student("Andy", 10002);
		Student student3 = new Student("Anna", 10003);
		Student student4 = new Student("Bixy", 10004);
		Student student5 = new Student("Cathy", 10005);
		
		student.put(student1.StudentName, student1.StudenRegNo);
		student.put(student2.StudentName, student2.StudenRegNo);
		student.put(student3.StudentName, student3.StudenRegNo);
		student.put(student4.StudentName, student4.StudenRegNo);
		student.put(student5.StudentName, student5.StudenRegNo);
		
		for(Entry<String, Integer> s : student.entrySet()) {
			System.out.println(s.getKey() + "==>" +s.getValue());
		}
	}

}

