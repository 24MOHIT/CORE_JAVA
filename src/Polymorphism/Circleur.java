package Polymorphism;

public class Circleur extends Shapeur{
double radius;
public final double PI=3.14;

public Circleur(double radius) {
	this.radius=radius;
}

public double area() {
	// TODO Auto-generated method stub
	return PI*radius*radius;
}
}