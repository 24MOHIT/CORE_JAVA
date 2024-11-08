package Interface;

public class Businessman implements Richman, Socialwork {

	@Override
	public void helptoother() {
		System.out.println("Help");
		
	}

	@Override
	public void earnmoney() {
		System.out.println("Earnmoney");		
	}

	@Override
	public void donation() {
		System.out.println("Donation Money");
		
	}

	@Override
	public void party() {
		System.out.println("Richman Party");
		
	}
	public static void main(String[] args) {
		Businessman b= new Businessman();
		b.helptoother();
		b.earnmoney();
		b.donation();
		b.party();
		
	}

}
