package Exercise51;

import java.util.Random;

public class randomnumber {

	public static void main(String[] args) {
		
     Random rn = new Random();
  
     for (int i=1; i<=5; i++) {
     int r=rn.nextInt(100);
        System.out.println(r);
	}
//	System.out.println("Random number="+Math.random());
		
}
}