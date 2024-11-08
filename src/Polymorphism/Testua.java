package Polymorphism;

public class Testua {
	public static void main(String[] args) {
		
	    Shapeua [] a= new Shapeua[3];
	    
	    a[0]= new Rectangleua(5,3);
	    a[1]= new Circleua(2);
	    a[2]= new Triangleua(3,5);
	    
	   double totalArea= calArea(a);
	   System.out.println("Total Area="+totalArea);
	   }
		
		private static double calArea(Shapeua[]a) {
			double totalArea=0;
			for (int i = 0; i < a.length; i++) {
				totalArea += a[i].area();
		}
			return totalArea;
		}
}
