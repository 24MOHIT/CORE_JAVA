package core.in.basic;
import java.time.LocalDateTime;
public class TestDateClass {
 public static void main(String[] args) {
	 
	 LocalDateTime now= LocalDateTime.now();
	
	System.out.println("Year="+now.getYear());
	System.out.println("Month="+now.getMonthValue());
	System.out.println("Day="+now.getDayOfWeek());
	System.out.println("Time="+now.getHour());
	System.out.println("Minute="+now.getMinute());
}
}
