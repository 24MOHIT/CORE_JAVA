package co.in.oop;

public class ConstructorOverloading {

	public ConstructorOverloading() {
	 System.out.println("I am defult constructor");
	}
	
	public ConstructorOverloading(int a) {
		this ();
		System.out.println("I am perameterized constructor");
	}
		
	public ConstructorOverloading(int a, int b) {
		this (a);
		System.out.println("I am two perameterized constructor");
	}
	
	public ConstructorOverloading(int a, int b, int c) {
		this (a,b);
		System.out.println("I am three perameterized constructor");
	}
	  public static void main(String[] args) {
		  ConstructorOverloading c= new ConstructorOverloading(1,2,3);
	}
	  
	  
}
