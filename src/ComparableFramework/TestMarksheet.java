package ComparableFramework;

import java.util.ArrayList;
import java.util.List;

public class TestMarksheet {
	
	public static void main(String[] args) {
		
		List<Marksheet> List= new ArrayList<Marksheet>();
		
		List.add(new Marksheet("101","Ram",80));
		List.add(new Marksheet("103","shyam",90));
		List.add(new Marksheet("102","Ravi",70));
		
		System.out.println(List);
		
		for (Marksheet marksheet : List) {
			System.out.println(marksheet);
		}
	}

}
