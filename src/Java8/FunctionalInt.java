package Java8;
@FunctionalInterface
public interface FunctionalInt {

	public int sum(int a, int b);

	public static void m1() {
		System.out.println("This is static method");
	}	
	public default void m2() {
		System.out.println("This is default method");
	}
	
}
