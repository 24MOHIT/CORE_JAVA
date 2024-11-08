package co.in.oop;

import java.time.LocalDate;

public class TestPerson {
	public static void main(String[] args) {
		
		LocalDate dob= LocalDate.of(2004, 06, 24);
		Person p= new Person();
		
		p.setName("Ram");
		p.setAddress("Indore123");
		p.setSalary(50000);
		p.setcity("Indore");
		p.setdob(dob);
		
		System.out.println("Name="+p.getName());
		System.out.println("Address="+p.getAddress());
		System.out.println("Salary="+p.getSalary());
		System.out.println("City="+p.getCity());
		System.out.println("dob="+p.getDob());
		System.out.println("Age="+p.getAge());
	
	}

}
