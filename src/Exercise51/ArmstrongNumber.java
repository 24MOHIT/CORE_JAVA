package Exercise51;

public class ArmstrongNumber {
public static void main(String[] args) {
	int a=2;
	int number= a;
	int result=0;
	
	while(number !=0) {
		int d= number%10;
	    result= d*d*d+result;
		number=number/10;
	}
	
	if (result==a) {
		System.out.println("Armstrong number");
	}else {
		System.out.println("Not Armstrong number");
	}
}
}
