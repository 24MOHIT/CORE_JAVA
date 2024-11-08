package co.in.oop;

public class Testcallcons {
	
	public static void main(String[] args) {
		
		RectangleConstructor r= new RectangleConstructor(3,4,"red",7);
		System.out.println("Borderwidth="+r.borderwidth);
		System.out.println("Colour="+r.colour);
		System.out.println("Length="+r.getLength());
		System.out.println("Width="+r.getWidth());
		r.area();
		
		CircleConstructor c= new CircleConstructor("black", 7, 5);
		System.out.println("Borderwidth="+c.borderwidth);
		System.out.println("Colour="+c.colour);
		System.out.println("Radius="+c.getRadius());
		c.area();
		
		TriangleConstructor t= new TriangleConstructor(2,3,"blue",7);
		System.out.println("Borderwidth="+t.borderwidth);
		System.out.println("Colour="+t.colour);
		System.out.println("Base="+t.getBase());
		System.out.println("Height="+t.getHeight());
		t.area();		
		
	}
}