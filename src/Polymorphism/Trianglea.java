package Polymorphism;

public class Trianglea extends Shapea {
	double base;
	double height;
	
	public Trianglea(double base, double height) {
		this.base= base;
		this.height= height;
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return base*height/2;
	}
     
}
