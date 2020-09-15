package question15;

import java.util.PriorityQueue;

public class DriverCode {
	
	public static void main(String[] args) {
		
		PriorityQueue<Student> pq = new PriorityQueue<Student>(5 , new StudentComparator());
		//pq.
		pq.add(new Student("Brian" , 106));
		pq.add(new Student("Briana" , 101));
		pq.add(new Student("Nova" , 105));
		pq.add(new Student("Chrity" , 103));
		pq.add(new Student("Martini" , 102));
		
		while(!pq.isEmpty()) {
			System.out.println(pq.poll().id);
		}
		
	}

}
