package co.in.oop;

public class Testoverride {
	
	public static void main(String[] args) {
		
		circleoverride c= new circleoverride(2,"red");
		System.out.println(c.getradius());
		System.out.println(c.getcolour());
		System.out.println(c.area());
		
		rectangleoverride r= new rectangleoverride(3,4,"Rohit","Verma");
		System.out.println(r.getLength());
		System.out.println(r.getWidth());
		System.out.println(r.getname());
		System.out.println(r.getAddress());
		System.out.println(r.area());
		
		triangleoverride t= new triangleoverride(6,7,"green");
		System.out.println(t.getBase());
		System.out.println(t.getHeight());
		System.out.println(t.getcolour());
		System.out.println(t.area());
	
		
	}

}
