package co.in.oop;

public class ShapeConstructor {
	
	protected String colour;
	protected int borderwidth;
	
	public ShapeConstructor(String colour, int borderwidth) {
		this.colour= colour;
		this.borderwidth= borderwidth;
	}
	
	
	public String getcolour(String colour) {
		return colour;
	}
	public int getborderwidth(int borderwidth) {
		return borderwidth;
	}
	
	
}
