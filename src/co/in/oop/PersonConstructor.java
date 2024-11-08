package co.in.oop;

import java.time.LocalDate;
import java.time.Period;
public class PersonConstructor {
	
	
	private String name;
	private int salary;
	private String city;
	private LocalDate dob;
	
	public PersonConstructor() {
		System.out.println("I am default Constructor");
	}
	    
	   public String getname() {
		   return name;
	   }
	   public int getsalary() {
		   return salary;
	   }
	   public String getcity() {
		   return city;
	   }
	   public LocalDate getdob() {
		   return dob;
	   }
	   
	   public int getAge() {
		  LocalDate currentdate= LocalDate.now();
		  return Period.between (dob, currentdate).getYears();
	   }

	
	public PersonConstructor(String name, int salary, String city, LocalDate dob) {
		
		this.name= name;
		this.salary= salary;
		this.city= city;
		this.dob= dob;
	}

		
	}
