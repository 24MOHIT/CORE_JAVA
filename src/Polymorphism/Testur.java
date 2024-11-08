package Polymorphism;

public class Testur {
	public static void main(String[] args) {
		Shapeur s1= Shapeur.getShapeur(1);
		Shapeur s2= Shapeur.getShapeur(2);
		Shapeur s3= Shapeur.getShapeur(3);
		
		System.out.println("Area of Rectangle="+s1.area());
		System.out.println("Area of Circle="+s2.area());
		System.out.println("Area of Triangle="+s3.area());
	}
	
	}

