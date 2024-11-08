package co.in.oop;

public class CircleConstructor extends ShapeConstructor {
	
	public static final float pi = 3.14f ;
	private int radius;
	
	
	
	public int getRadius() {
		return radius;
	}
	
	CircleConstructor( String colour,int borderwidth,int radius){
		super(colour,borderwidth);
		this.radius = radius;
	}
     public void area() {
    	 
		System.out.println("Area of circle="+pi*radius*radius);
     }
}
