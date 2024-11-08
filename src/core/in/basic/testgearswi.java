package core.in.basic;

public class testgearswi {
public static void main(String[] args) {
	
	int number=6;
	String speed;
	switch (number) {
	case 1:
		speed="20";
		break;
	case 2:
		speed="40";
		break;
	case 3:
		speed="60";
		break;
	case 4:
		speed="80";
		break;
	case 5:
		speed="100";
		break;
	case 6:
		speed="Reverse";
		break;

	default:
		speed="invailid speed";
		break;
	}
	System.out.println("speed is "+speed);
}
}
