package Exceptionhandling;

public class TestNullException {
public static void main(String[] args) {
	String name= null;
	
	try {
	System.out.println(name.charAt(0));
	}
	catch (NullPointerException e) {
		System.out.println("String is Null");
	}
	}
}
