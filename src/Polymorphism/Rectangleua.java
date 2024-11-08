package Polymorphism;

public class Rectangleua extends Shapeua {
	double length;
	double width;
	
	public Rectangleua(double length, double width) {
		this.length= length;
		this.width= width;
	}
	
	
	public double area() {
		double Area=length*width;
		System.out.println("Rectangle Area="+Area);
		return Area ;
		
}
}
