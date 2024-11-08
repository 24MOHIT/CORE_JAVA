package co.in.oop;

public class circleoverride extends shapeoverride {
	
	private int radius;
	
	public circleoverride(int radius, String colour) {
		super (colour);
		this.radius= radius;	
}	
	
	public int getradius() {
	 return radius;
	}
	
	@Override
	public double area() {
		// TODO Auto-generated method stub
		return 3.14*radius*radius;
	}

     
	
	
	
	}


