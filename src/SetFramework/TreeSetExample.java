package SetFramework;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetExample {
	public static void main(String[] args) {
		
		TreeSet s= new TreeSet();
		
		s.add(4);
		s.add(32);
		s.add(31);
		
		System.out.println(s);
		
		Iterator it= s.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		
	}

}
