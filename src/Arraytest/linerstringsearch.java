package Arraytest;

public class linerstringsearch {
public static int Search(String[] s, String key ) {
	for (int i=0; i<s.length; i++ ) {
		if (s[i]==key) {
		return i;
	}
	}
return -1;
}
public static void main (String[] args) {
	String [] s= {"samosa","aalubada","kachori"};
	String key="poha";
	int index = Search(s,key);
	if (index==-1) {
		System.out.println("string is not found="+key);
	}
	else {
		System.out.println("string is found="+key);
	}
}
}


