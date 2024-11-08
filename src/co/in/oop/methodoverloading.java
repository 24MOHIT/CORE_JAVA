package co.in.oop;

public class methodoverloading {
	
	public void sum() {
		System.out.println("Hello World");
	}
	
	public int sum(int a) {
		System.out.println("I am perameterized");
		return a;
	}
	
	public void sum (int a, int b) {
		System.out.println("Iam two perameterized");
	}
	
	public static void main(String[] args) {
		
		methodoverloading m= new methodoverloading();
		
		m.sum();
		m.sum(10);
		m.sum(3,4);
	}

}
