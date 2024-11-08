package Arraytest;

public class arraytable {
public static void main(String[] args) {
	int [] a = {1,2,3,4,5,};
	
	for (int i=1; i<=a.length; i++) {
		for (int j=1; j<=a.length; j++) {
			System.out.print(i*j+"\t" );
		}
		System.out.println();
	}
}
}
