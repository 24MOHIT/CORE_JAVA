package co.in.oop;

public  class ShapeFinalclass {
	
	private String colour;
    public ShapeFinalclass(String colour) {
    	this.colour=colour;
    }
	public String getColour() {
		return colour;
	}
	
	public final double area() {
		return 0;
	}

}
