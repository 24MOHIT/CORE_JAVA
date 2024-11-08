package Exceptionhandling;

public class TestFund {
	
	public static void main(String[] args) throws FundException {
		
		int AccountBalance= 7000;
		
		if (AccountBalance < 9000) {
			throw new FundException();
		}
		else {
			System.out.println("FundTransfer");
		}
	}

}
