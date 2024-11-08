package Stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Testcontestent {

	public static void main(String[] args) {
		
		ArrayList<Contestent> list= new ArrayList<Contestent>();
		list.add(new Contestent("Ram","9912342222"));
		list.add(new Contestent("Ravi","9912342222"));
		list.add(new Contestent("Shaym","9912345770"));
		
				
		System.out.println("Get phone number:-");
		list.stream().map(e -> e.phone).forEach(System.out::println);
		
		System.out.println("Get valid phone number:-");
		list.stream().map(e -> e.phone).filter(e -> e.length()==10).forEach(System.out::println);;
		
		System.out.println("Remove duplicate phone number:-");
		list.stream().map(e -> e.phone).filter(e -> e.length()==10).distinct().forEach(System.out::println);
		
		System.out.println("shuffle phone number:-");
		list.stream().map(e -> e.phone).filter(e -> e.length()==10).distinct().collect(Collectors.collectingAndThen(Collectors.toList(),e ->{
			Collections.shuffle(e);
			return e.stream();
		})).forEach(System.out::println);;
	}
}
