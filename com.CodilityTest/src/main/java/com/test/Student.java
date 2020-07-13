package com.test;

public class Student implements Comparable<Student>{	
		
		int StudenRegNo;
		String StudentName;
		int totalMarks;
		
		public Student(String StudentName, int StudenRegNo){
			this.StudentName = StudentName;
			this.StudenRegNo = StudenRegNo;		
		}
		
		public Student(String StudentName, int StudenRegNo, int totalMarks){
			this.StudentName = StudentName;
			this.StudenRegNo = StudenRegNo;	
			this.totalMarks = totalMarks;
		}
		
		

		public int getStudenRegNo() {
			return StudenRegNo;
		}

		public void setStudenRegNo(int studenRegNo) {
			this.StudenRegNo = studenRegNo;
		}

		public String getStudentName() {
			return StudentName;
		}

		public void setStudentName(String studentName) {
			this.StudentName = studentName;
		}

		public int getTotalMarks() {
			return totalMarks;
		}

		public void setTotalMarks(int totalMarks) {
			this.totalMarks = totalMarks;
		}
		
		public int compareTo(Student compareStu) {
			return totalMarks < compareStu.totalMarks ? 1:-1;
		}
		
		 @Override
		    public String toString() {
		        return "[ StudentName=" + this.StudentName + ", RegistrationNo=" + this.StudenRegNo + ", score=" + this.totalMarks + "]";
		    }
	
		
}

