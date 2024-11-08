package ComparatorFramework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestCompare {
	public static void main(String[] args) {
		
	List<MarkSheet> list= new ArrayList<MarkSheet>();
	
	list.add(new MarkSheet("01", "Ravi", 60));
	list.add(new MarkSheet("03", "Shyam", 70));
	list.add(new MarkSheet("02", "Ram", 89));
		
	Compare c= new Compare();
	Collections.sort(list, c);
	list.forEach(System.out::println);
	}

}
