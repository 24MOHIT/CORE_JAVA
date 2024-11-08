package co.in.oop;

public class shapeoverride {
	
	private String colour;
	private String name;
	private String address;
	
	public shapeoverride(String name,String adress) {
		this.name= name;
		this.address=adress;
	}
	
	public shapeoverride(String colour) {
		this.colour= colour;
		
	}
	public String getcolour() {
		return colour;
	}
	public String getname() {
		return name;
	}
	
	public String getAddress() {
		return address;
	}
	public double area() {
		return 0;
	}
}
