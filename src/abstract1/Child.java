package abstract1;

public class Child extends Parent {

	@Override
	public void Loan() {
		System.out.println("Complete Loan");

	}

	public static void main(String[] args) {
		Child c = new Child();
		c.Loan();
	}

}
