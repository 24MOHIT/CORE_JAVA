package core.in.basic;

public class testmultimethod {
public static int multiply() {
	int a=10;
	int b=2;
	int c=a*b;
	System.out.println(c);
	return c;
}
public static int divide(int a,int b) {
	return a/b;
}
public static void main(String[] args) {
	testmultimethod.multiply();
	System.out.println(testmultimethod.divide(700,100));
}
}
