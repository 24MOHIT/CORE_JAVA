package Exercise51;

public class factorialnumber {

	public static void main(String[] args) {
		
		int a=4;
		int fact=1;
		for (int i = 1; i<=a ; i++) {
			fact= fact*i;
		}
		System.out.println("factorial is "+fact);
	}
}
