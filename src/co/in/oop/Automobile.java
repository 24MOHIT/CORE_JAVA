package co.in.oop;

public class Automobile {

	private String colour;
	private int speed;
	private String company;
	
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	
	public void changegear(int gear) {
		if (gear<=5) {
			speed += gear*20;
			System.out.println("gear="+gear);
		}
		else {
			System.out.println("invailid gear");
		}
	}
		
		
		
	
	
	
	public static void main(String[] args) {
		
		Automobile A= new Automobile();
		A.setColour("Red");
		A.setCompany("Toyota");
		A.setSpeed(0);
		
		
		A.changegear(4);
		
		
		System.out.println("Colour="+A.getColour());
		System.out.println("Company="+A.getCompany());
		System.out.println("speed="+A.getSpeed());
		
		
	}
}
