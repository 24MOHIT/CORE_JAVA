package QueueFramework;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Queue;

public class Testque {

	public static void main(String[] args) {
		
		Queue q=new ArrayDeque();
		q.offer(3);
		q.offer("Ravi");
		
		Iterator it= q.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}

	
		
	}
}
