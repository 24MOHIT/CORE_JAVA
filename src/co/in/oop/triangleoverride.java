package co.in.oop;


public class triangleoverride extends shapeoverride {
 
	 private int base;
	 private int height;
	 
	 public triangleoverride(int base, int height, String colour) {
	 super(colour);
	 this.base= base;
	 this.height= height;
	 } 
	 
	public int getBase() {
		return base;
	}
	public int getHeight() {
		return height;
	}

	@Override
	public double area() {
		double Area=base*height/2;
		return Area ;
	}
	
	
}
