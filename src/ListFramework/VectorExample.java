package ListFramework;

import java.util.Iterator;
import java.util.Vector;

public class VectorExample {
public static void main(String[] args) {
	
	Vector v= new Vector();
	v.add("Ram");
	v.add(2);
	v.add(5.2);
	
	System.out.println(v);
	
	Iterator it= v.iterator();
	
	while(it.hasNext()) {
		System.out.println(it.next());
	}
		
		
	
	
}
}
