package core.in.basic;

public class methodcalling {
public static void sum() {
	int a=21;
	int b=21;
	System.out.println("Add="+(a+b));
}
public  void sub() {
	int a=10;
	int b=5;
	System.out.println("Sub="+(a-b));
	
}
public int multiply() {
	int a=10;
	int b=2;
	int c=a*b;
	System.out.println("Multiply="+c);
	return c;
}
public int divide(int a,int b) {
	return a/b;
}
public static void main(String[] args) {
methodcalling.sum(); 
methodcalling m = new methodcalling();
m.sub();
m.multiply();
System.out.println("Divide="+m.divide(10,5));
}
}

