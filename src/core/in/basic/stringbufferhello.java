package core.in.basic;

public class stringbufferhello {
	public static void main(String[] args) {
			
StringBuffer sb =new StringBuffer("Mohit");
sb.append("Prajapat");
System.out.println(sb);
System.out.println("Length="+sb.length());
System.out.println("Capacity="+sb.capacity());
System.out.println("Char at="+sb.charAt(2));
System.out.println("IndexOf="+sb.indexOf("Mohit"));
System.out.println("Replace="+sb.replace(1,4,"ok"));
System.out.println("Reverse="+sb.reverse());
}
}