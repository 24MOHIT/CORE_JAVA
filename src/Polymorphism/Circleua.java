package Polymorphism;

public class Circleua extends Shapeua {
	double radius;
	public final double PI=3.14;

	public Circleua(double radius) {
		this.radius=radius;
	}

	public double area() {
		double Area= PI*radius*radius;
		System.out.println("Circle Area="+Area);
		return Area;
	}

}
