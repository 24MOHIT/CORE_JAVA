package Polymorphism;

public class Circlea extends Shapea {
	double radius;
	public final double PI=3.14;
	
	public Circlea(double radius) {
		this.radius=radius;
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return PI*radius*radius;
	}
	

}
