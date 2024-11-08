package Exceptionhandling;

public class ArithmaticException {

	public static void main(String[] args) {
		int i=10;
		int a=0;
		
		try {
		int c=i/a;
		System.out.println(c);
		}
	catch (ArithmeticException e) {
		System.out.println("Your number is not divisable by Zero");
	
	    System.out.println(e.getMessage());
	    
	    //e.printStackTrace();
	}
	}
}
