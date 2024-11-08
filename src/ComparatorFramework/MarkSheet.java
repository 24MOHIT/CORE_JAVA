package ComparatorFramework;

public class MarkSheet {
	
	public String rollno;
	public String name;
	public int marks;
	
	public MarkSheet(String r, String n,int m) {
		this.rollno=r;
		this.name=n;
		this.marks=m;
	}

	public String toString() {
		return rollno+","+name+","+marks;
	}
}
