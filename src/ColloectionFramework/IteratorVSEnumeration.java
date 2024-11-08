package ColloectionFramework;

import java.util.Enumeration;
import java.util.Vector;

public class IteratorVSEnumeration {
	
	public static void main(String[] args) {
		
		Vector v= new Vector();
		v.addElement(3);
		v.addElement(4);
		
		Enumeration e=v.elements();
		v.addElement(5);
		
		
		while(e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}
		System.out.println(v);
	}


}
