package Exceptionhandling;

public class MultiCatchExc {
public static void main(String[] args) {
	
	String name= null;
	
	try {
		System.out.println(name.charAt(2));
	} 
	catch (StringIndexOutOfBoundsException e) {
		System.out.println("string is small");
	}
	catch (NullPointerException e) {
	System.out.println(e.getMessage());
	}
	finally {
		System.out.println("I am always Run");
	}
}
}
