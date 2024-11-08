package co.in.oop;

public class TestAccountConstructor {
	public static void main(String[] args) {
		
		AccountConstructor a= new AccountConstructor("123","saving",5000);
		
		System.out.println(a.getnumber());
		System.out.println(a.getaccountype());
		System.out.println(a.getbalance());
		
	    a.deposit(100);	
	    a.withdrawl(50);
	    a.Fundtransfer(50);
	}
	
}
