package co.in.oop;

public class TestEmploye {

	private int id;
	private String name;
	private String post;
	private double salary;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPost() {
		return post;
	}
	public void setPost(String post) {
		this.post = post;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	} 
	
	
	public static void main(String[] args) {
		
		TestEmploye e= new TestEmploye();
		
		e.setId(123);
		e.setName("Rohit");
		e.setPost("Head Master");
		e.setSalary(20000);
		
		System.out.println("Id="+e.getId());
		System.out.println("Name="+e.getName());
		System.out.println("Post="+e.getPost());
		System.out.println("Salary="+e.getSalary());
	}
}




