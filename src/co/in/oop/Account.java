package co.in.oop;

public class Account {

	private String number;
	private String accounttype;
	private double balance;
	

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getAccounttype() {
		return accounttype;
	}

	public void setAccounttype(String accounttype) {
		this.accounttype = accounttype;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public void deposit (double amount) {
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
			
	}
	