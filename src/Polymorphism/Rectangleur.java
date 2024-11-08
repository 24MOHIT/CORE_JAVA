package Polymorphism;

public class Rectangleur extends Shapeur {
	double length;
	double width;
	
	public Rectangleur(double length, double width) {
		this.length= length;
		this.width= width;
	}
	
	
	@Override
	public double area() {
		double Area= length*width;
		return Area;
}
}