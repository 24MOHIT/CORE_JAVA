package Polymorphism;

public class Rectanglea extends Shapea {

	double length;
	double width;
	
	public Rectanglea(double length, double width) {
		this.length= length;
		this.width= width;
	}
	
	@Override
	public double area() {
		// TODO Auto-generated method stub
		return length*width;
}
}