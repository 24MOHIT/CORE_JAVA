package SetFramework;

import java.util.HashSet;
import java.util.Set;

public class SetIntExample {
	public static void main(String[] args) {
		
		Set s= new HashSet();
	    s.add("abc");
	    s.add("abc");
	    s.add(null);
	    s.add(null);
	    
	    System.out.println(s);
	    		
	}

}
