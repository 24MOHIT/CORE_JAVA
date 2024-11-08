package co.in.oop;

public class TriangleConstructor extends ShapeConstructor {
	
	private int base;
	private int height;
	
		
	public int getBase() {
		return base;
	}
	public int getHeight() {
		return height;
	}
	public TriangleConstructor(int base, int height, String colour, int borderwidth) {
		super(colour, borderwidth);
		this.base=base;
		this.height=height;
	}
    
	public void area() {
		System.out.println("Area of Triangle="+(base*height)/2);
	}

}
