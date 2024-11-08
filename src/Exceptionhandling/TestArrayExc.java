package Exceptionhandling;

public class TestArrayExc {
public static void main(String[] args) {
	
	int [] a= {1,2,3};
	try {
		System.out.println(a[4]);
	
	} catch (ArrayIndexOutOfBoundsException e) {
		System.out.println("Out of Array");
	}
	finally {
		System.out.println("I am always Run");
	}
}
}
