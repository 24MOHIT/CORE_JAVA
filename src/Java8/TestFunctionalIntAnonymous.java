package Java8;
// Anonymous
public class TestFunctionalIntAnonymous {

	public static void main(String[] args) {
		
		FunctionalInt f= new FunctionalInt() {
			
			@Override
			public int sum(int a, int b) {
				// TODO Auto-generated method stub
				return a+b;
			}
		};
		int a=5;
		int b=5;
		System.out.println(f.sum(a, b));
		
		f.m2();
	}
}
