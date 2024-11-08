package Exceptionhandling;

public class TestLogin {
	public static void main(String[] args) throws LoginException {
		
		String login= "Mohit";
		
		if (login != "Mohit") {
			throw new LoginException();
		}else {
			System.out.println("User Login succesfull ");
		}
	}
}

