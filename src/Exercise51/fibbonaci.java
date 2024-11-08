package Exercise51;

public class fibbonaci {
public static void main(String[] args) {
	
	int a= 0, b=1;
	
	for (int i = 0; i<10; i++) {
		
		int c=a+b;
		a=b;
		b=c;
		System.out.print(c+"\t");
								
	}
	}
}
