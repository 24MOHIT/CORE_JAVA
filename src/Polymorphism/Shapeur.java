package Polymorphism;

public class Shapeur {
	public Shapeur() {
		
	}
	public double area() {
		return 0;
	}
    
	public static Shapeur getShapeur(int i) {
		if (i==1) {
			return new Rectangleur(5,3);
		}
		if (i==2) {
			return new Circleur(3);
		}
		if (i==3) {
			return new Triangleur(3,5);
		}
		return new Shapeur();
	}
	
}
