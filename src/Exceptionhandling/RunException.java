package Exceptionhandling;

public class RunException {
public static void main(String[] args) {
	
	String name= "Vijay";
	try {
	System.out.println("Length of name is="+name.length());
    System.out.println("Char at 7 position="+name.charAt(6));
	}
	catch(StringIndexOutOfBoundsException e) {
			System.out.println("string is short");
	}
	catch (RuntimeException e) {
		System.out.println(e.getMessage());
	}
}
}
