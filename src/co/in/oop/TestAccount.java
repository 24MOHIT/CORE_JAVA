package co.in.oop;

public class TestAccount {
	public static void main(String[] args) {
		
		Account a= new Account();
		a.setNumber("1234");
		a.setAccounttype("BOI");
		a.setBalance(10000.0);
		a.deposit(200);
		a.withdrawl(100);
		a.Fundtransfer(5);
		
		System.out.println(a.getNumber());
		System.out.println(a.getAccounttype());
		System.out.println(a.getBalance());
		
		
		
        
	}
	     
}