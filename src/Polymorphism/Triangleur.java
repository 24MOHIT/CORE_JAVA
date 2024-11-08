package Polymorphism;

public class Triangleur extends Shapeur {
	double base;
	double height;
	
	public Triangleur(double base, double height) {
		this.base= base;
		this.height= height;
	}

	public double area() {
		// TODO Auto-generated method stub
		return base*height/2;
	}
}