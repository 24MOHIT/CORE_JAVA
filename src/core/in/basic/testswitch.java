package core.in.basic;

public class testswitch {
public static void main(String[] args) {
	
	int number=2;
	String day;
	switch (number) {
	case 1:
	day="Monday";
				break;
	case 2:
		day="Tuesday";
					break;
	case 3:
		day="Wednesday";
					break;
	case 4:
		day="Thursday";
					break;
	case 5:
		day="Friday";
					break;
	case 6:
		day="Saturday";
					break;
	case 7:
		day="Sunday";
					break;

	default:
		day="invailid day";
		break;
	}
	System.out.println("The Day is "+day);
}
}
