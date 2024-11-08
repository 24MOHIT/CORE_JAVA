package ColloectionFramework;

import java.util.HashMap;
import java.util.Map;

public class MapInterface {
	
	public static void main(String[] args) {
		
		Map m=new HashMap();
		
		m.put(1, "Abhi");
		m.put(3, "Ram");
		m.put(2, "Syam");
		
		System.out.println(m);
		
		System.out.println(m.get(2));
	}

}
