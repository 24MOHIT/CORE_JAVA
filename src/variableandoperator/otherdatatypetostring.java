package variableandoperator;

public class otherdatatypetostring {
	public static void main(String[] args) {
		
		String str= String.valueOf(5);
		String str1= String.valueOf(5.5);
		String str2= String.valueOf(5.55D);
		String str3= String.valueOf(555l);
		String str4= String.valueOf(true);
		
		System.out.println("int="+str);
		System.out.println("float="+str1);
		System.out.println("double="+str2);		
		System.out.println("long="+str3);
		System.out.println("boolean="+str4);
	}

}
