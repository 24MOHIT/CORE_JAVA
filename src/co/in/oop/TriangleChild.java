package co.in.oop;

public class TriangleChild extends ShapeParent {
	
	private int base;
	private int height;
	
	public int getBase() {
		return base;
	}
	public void setBase(int base) {
		this.base = base;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	
	public void area() {
		System.out.println("Area of Triangle="+(base*height)/2);
	}

}
