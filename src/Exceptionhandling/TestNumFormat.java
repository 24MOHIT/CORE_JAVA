package Exceptionhandling;

public class TestNumFormat {
public static void main(String[] args) {
	
	String name= "Mohit321";
		
	try {
		int i= Integer.parseInt(name);
	
	    System.out.println(i);	
	
   }catch (NumberFormatException e) {
		System.out.println("Wrong input");
	}
	
}
}
