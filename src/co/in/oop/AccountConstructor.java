package co.in.oop;

public class AccountConstructor {
	
	private String number;
    private String accounttype;
	private double balance;
		
	public AccountConstructor() {
		System.out.println("I am default constructor");
	}
    
	public String getnumber() {
		return number;
	}
	public String getaccountype() {
		return accounttype;
	}
	public double getbalance() {
		return balance;
	}
	
	
	public void deposit (double amount){
		if (amount>0) {
			balance+= amount;
			System.out.println("Deposit Successfull.New balance="+balance);
		}
		else {
			System.out.println("invailid Deposit amount");
		}	
	}
		public void withdrawl(double amount) {
			if(amount >0 && amount <=balance) { 
				balance -= amount ;
				System.out.println("withdraw successful.New balance"+ balance);
			}
			else {
				System.out.println("invalid withdraw amount or insufficiant balance");
			}
		}
		
		public void Fundtransfer(double amount) {
			if (amount >0 && amount <=balance) {
				balance-= amount;
				System.out.println("Fund transfer successful.New balance"+balance);
			}
			else {
				System.out.println("invailid Fundtransfer amount");
			}
		}

	
	public AccountConstructor(String number, String accounttype, double balance) {
       
		this.number= number;
        this.accounttype= accounttype;
        this.balance= balance;
        
	}	
	}		
