package ListFramework;

import java.util.ArrayList;
import java.util.List;

public class ListIntExample {
	public static void main(String[] args) {
		
		List List= new ArrayList();
		
		List.add(0,"KGF");
		List.add(1,5);
		List.add(2,"KGF");
		List.add(3,5.2);
		List.add(4,null);
		List.add(5,null);
		
		System.out.println(List);
		System.out.println(List.get(3));
		
		List.remove(2);
		System.out.println(List);
		
	     List.set(0, "Kali");
		System.out.println(List);
		
		List.subList(0, 5);
		System.out.println(List);
		
		List.indexOf(1);
		System.out.println(List);
		
		List.lastIndexOf(5);
		System.out.println(List);
		}

}
