package ComparatorFramework;

import java.util.Comparator;

import ComparableFramework.Marksheet;

public  class Compare implements Comparator<MarkSheet> {
	
	
		public int compare(MarkSheet o1, MarkSheet o2) {
		
		if(o1.name==o2.name) {	
		return o1.marks-o2.marks;
		}
		else if (o1.marks==o2.marks) {
		return o1.name.compareTo(o2.name);
		}
		else {
			o1.rollno.compareTo(o2.rollno);
		}
		return 0;
	
	}

}
