package Exceptionhandling;

public class TestDuplicate {
	
	public static void main(String[] args) throws DuplicateException {
		
		String name= "Ram";
		
		if (name=="Ram1") {
			throw new DuplicateException();
		}
		else {
			System.out.println("Not Duplicate Type");
		}
	}

}
