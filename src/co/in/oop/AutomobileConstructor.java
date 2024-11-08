package co.in.oop;

public class AutomobileConstructor {
    	
	private String colour;
	private String company;
	private int speed;
	
	
	
    public String  getcolour() {
	return colour;
	}
	public String getcompany() {
		return company;
	}
	public int getspeed() {
		return speed;
	}
	
	public void AutomobileConstructor() {
		System.out.println("I am default constructor");
	}
	public AutomobileConstructor(String colour, String company, int speed) {
		this.colour= colour;
		this.company= company;
		this.speed= speed;
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
}
