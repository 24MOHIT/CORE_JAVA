package co.in.oop;

public class rectangleoverride extends shapeoverride {
	
	private int length;
	private int width;
	
	public rectangleoverride(int length, int width,String name, String address ) {
		super (name,address);
		
		this.length=length;
		this.width=width;
		
	}

	public int getLength() {
		return length;
	}

	public int getWidth() {
		return width;
	}

	@Override
	public double area() {
		double Area=length*width;
		return Area;
	}
	

}
