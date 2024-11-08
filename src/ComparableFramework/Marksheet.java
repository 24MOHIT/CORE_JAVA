package ComparableFramework;

public class Marksheet implements Comparable <Marksheet> {

	public String rollno;
	public String name;
	public int marks;
	
	public Marksheet(String r, String n, int m) {
		this.rollno= r;
		this.name= n;
		this.marks= m;
	}
	
	@Override
	public int compareTo(Marksheet o) {
				return this.marks - o.marks;
	}
	
	public String toString() {
		return rollno+","+name+","+marks;
	}
}
