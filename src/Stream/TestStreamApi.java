package Stream;

import java.util.ArrayList;
import java.util.List;

public class TestStreamApi {

	public static void main(String[] args) {
		
		List<String> list=new ArrayList<String>();
		
		list.add("One");
		list.add("Two");
		list.add("Three");
		list.add("Four");
		list.add("one");
		
		System.out.println("Simple list:-"+list);
		
		System.out.println("List in sorted order:-");
		list.stream().sorted().forEach(System.out::println);;
		
		System.out.println("Remove duplicate from list:-");
		list.stream().distinct().forEach(System.out::println);
		
		System.out.println("List start with T:-");
		list.stream().filter(e -> e.startsWith("T")).forEach(System.out::println);
		
		System.out.println("List in upper case:-");
		list.stream().map(e -> e.toUpperCase()).forEach(System.out::println);
		
		System.out.println("List in lower case:-");
		list.stream().map(e -> e.toLowerCase()).filter(e -> e.startsWith("o")).forEach(System.out::println);
	}
}
