package Exercise51;

public class divisablenum {
	
	public static void main(String[] args) {
		
		int a=7;
		int sum=0;
		for (int i = 100; i<=200; i++) {
			if (i%a==0) {
				sum+=i;
				System.out.println("divisable no.="+i);
			}
		}
		System.out.println("sum="+sum);
	}

}
