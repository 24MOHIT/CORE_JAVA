package Arraytest;


public class linearcharsearch {
	public static int  Search(char[] character,char key) {
		
		for (int i = 0; i < character.length; i++) {
		    if (character [i]==key) {
		    	return i;
		    }
		}
		   return -1;
	}
public static void main(String[]args) {
	char [] character= {'a','b','c','d'};
	char key='e';
	int index = Search(character,key);
	if (index==-1) {
		System.out.println("char is not found at index="+key);
	}
	else {
		System.out.println("char is found at index="+key);
	}
}
}

