package co.in.oop;

public class TestInherit {
	
	public static void main(String[] args) {
		
		RectangleChild r= new RectangleChild();
		r.setLength(2);
		r.setWidth(2);
		System.out.println("Length="+r.getLength());
		System.out.println("Width="+r.getWidth());
		r.area();
		
		CircleChild c= new CircleChild();
		
		c.setborderwidth(2);
		c.setcolour("Red");
		System.out.println("BorderWidth="+c.getborderwidth());
		System.out.println("Colour="+c.getcolour());
		
		c.setRadius(2);
		System.out.println("Radius="+c.getRadius());
		c.area();
		
		TriangleChild t= new TriangleChild();
		t.setBase(2);
		t.setHeight(3);
		System.out.println("Base="+t.getBase());
		System.out.println("Height="+t.getHeight());
		t.area();
		
	}

}
