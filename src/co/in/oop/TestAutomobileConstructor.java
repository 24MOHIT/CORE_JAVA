package co.in.oop;

public class TestAutomobileConstructor {

	public static void main(String[] args) {
		
		AutomobileConstructor a= new AutomobileConstructor("Red","Toyota",0);
		
		a.changegear(3);
		
		System.out.println(a.getcolour());
		System.out.println(a.getcompany());
		System.out.println(a.getspeed());
}
}