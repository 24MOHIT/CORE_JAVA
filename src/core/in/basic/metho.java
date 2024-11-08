package core.in.basic;

public class metho {
public static void main(String[] args) {
	String name=("Mohit Prajapat");
	System.out.println("String Length="+name.length());
	System.out.println("7 character is="+name.charAt(7));
	System.out.println("Mohi index is="+name.indexOf("Mohi"));
	System.out.println("first o position="+name.indexOf("o"));
	System.out.println("last p position="+name.lastIndexOf("p"));
	System.out.println("M is replaced by R="+name.replace("M","R"));
	System.out.println("Chhota vijay="+name.toLowerCase());
	System.out.println("Bada Vijay="+name.toUpperCase());
	System.out.println("starts with Mohit="+name.startsWith("Mohit"));
	System.out.println("End with pat="+name.endsWith("pat"));
	System.out.println("substring="+name.substring(5));
}
}
