
package co.in.oop;

import java.time.LocalDate;

public class TestPersonConstructor {

public static void main(String[] args) {
		
	   
		PersonConstructor p= new PersonConstructor("Ram", 5000, "Indore", LocalDate.of(2004, 06, 24));
		 LocalDate dob= LocalDate.of(2004, 06, 24);
		System.out.println("Name="+p.getname());
		System.out.println("Salary="+p.getsalary());
		System.out.println("City"+p.getcity());
		System.out.println("Dob="+p.getdob());
		System.out.println("Age="+p.getAge());

		
		
	}
}
