package Polymorphism;

public class Triangleua extends Shapeua {
	double base;
	double height;
	
	public Triangleua(double base, double height) {
		this.base= base;
		this.height= height;
	}

	public double area() {
		double Area=base*height/2;
		System.out.println("Triangle Area="+Area);
		return Area;
	}
}
