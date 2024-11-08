package ColloectionFramework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestFailFast {
	
	public static void main(String[] args) {
		
		List l=new ArrayList();
		l.add(1);
		l.add("Raas");
		
		Iterator it= l.iterator();
		l.add(3);
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
