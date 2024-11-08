package co.in.oop;

public class BikeConstructor {
 
	private String name;
	private String colour;
	private int price;
	
	 public BikeConstructor() {
		 System.out.println("I am default constructor");
	 }
	 
	 public String getname() {
		 return name;
	 }
	 public String getcolour() {
		 return colour;
	 }
	 public int getprice() {
		 return price;
	 }
	 
	 public BikeConstructor(String name, String colour, int price) {
		 this.name=name;
		 this.colour=colour;
		 this.price=price;
	 }
	 
	 
	 public static void main(String[] args) {
		
		 BikeConstructor b= new BikeConstructor("Splendor", "Black", 90000 );
		 
		 System.out.println("Name="+b.getname());
		 System.out.println("Colour="+b.getcolour());
		 System.out.println("Price="+b.getprice());
		 
		 
	}
	 
}


