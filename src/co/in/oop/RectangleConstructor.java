package co.in.oop;

public class RectangleConstructor extends ShapeConstructor {
	
	private int length;
	private int width;
	
	
	
	public int getLength() {
		return length;
	}
	public int getWidth() {
		return width;
	}
	
	public RectangleConstructor(int length, int width, String colour,int borderwidth) {
		
		super(colour, borderwidth);
		
		this.length= length;
		this.width= width;
		
	}
	
	public void area() {
		System.out.println("Area of Rectangle="+length*width);
	}

}
