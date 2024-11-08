package co.in.oop;

import java.time.LocalDate;
import java.time.Period;

public class Person {
    private String name;
	
	private String address;
	
	private int salary;
	
	private String city;
	
	private LocalDate dob;

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
	
	public String getAddress() {
	return address;
	}
	public void setAddress(String address) {
		this.address=address;
	}
	
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary=salary;
	}
	
	public String getCity() {
		return city;
	}
	public void setcity(String city) {
		this.city=city;
	}
	public LocalDate getDob() {
		return dob;
	}
	public void setdob(LocalDate dob) {
		this.dob=dob;
	}
	
	public int getAge() {
		LocalDate currentDate= LocalDate.now();
		return Period.between(dob, currentDate).getYears();
		
	}
	
	}
	





