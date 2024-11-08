package Exceptionhandling;

public class TestStringindoutbound {
public static void main(String[] args) {
	String name="Mohit";
	
	try {
	System.out.println(name.charAt(6));
	}
	catch (StringIndexOutOfBoundsException e) {
          System.out.println("string is short");
	}
}
}
