package co.in.oop;

public class CircleChild extends ShapeParent {
	
	//public static final float pi = 3.14f ;
	private int radius;

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	public void area () {
		
		
		System.out.println("Area of Circle="+pi*radius*radius);
	}
	

}