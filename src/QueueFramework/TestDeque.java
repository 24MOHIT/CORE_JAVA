package QueueFramework;

import java.util.ArrayDeque;
import java.util.Deque;

public class TestDeque {
	
	public static void main(String[] args) {
		
	  Deque d= new ArrayDeque();
	  d.offerLast(54);
	  d.offerFirst(45);
	  System.out.println(d);
	  
	  System.out.println(d.peek());
	  System.out.println(d);
	  
	  System.out.println(d.poll());
	  System.out.println(d);
	}

}
