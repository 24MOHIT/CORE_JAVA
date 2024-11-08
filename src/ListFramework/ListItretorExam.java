package ListFramework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListItretorExam {
	public static void main(String[] args) {
		List list= new ArrayList();
		list.add("Ram");
		list.add(3);
		list.add(null);
		list.add(5.3);
		
		System.out.println(list);
		
		Iterator it= list.listIterator();
		
		while (it.hasNext()){
			System.out.println(it.next());
		}
			
		}
	}

 
	

