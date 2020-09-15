package question15;

import java.util.Comparator;

public class StudentComparator implements Comparator<Student>{

public int compare(Student s1, Student s2) {
		
		if(s1.id < s2.id)
			return 1;
		else if(s1.id > s2.id)
			return -1;		
					return 0;			
	}

}
