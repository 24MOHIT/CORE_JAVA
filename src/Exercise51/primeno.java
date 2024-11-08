package Exercise51;

public class primeno {
public static void main(String[] args) {
	
	int a=7;
	int count=0;

	if (a%2==0) {		
		count++;
	}
	if (count==0) {
		System.out.println("Prime Number");
	}else {
		System.out.println("Not Prime Number");
	}
}
}
