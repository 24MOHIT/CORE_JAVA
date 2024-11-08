package ColloectionFramework;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionInterfaceMethod {
public static void main(String[] args) {
	
	Collection ci= new ArrayList();
	ci.add("Ram");
	ci.add(4);
	ci.add(null);
	
	//ci.addAll(ci);
	//ci.clear();
	
	
	System.out.println(ci);
		
	System.out.println(ci.isEmpty());
	
	System.out.println(ci.remove(0));
	
	
}
}
