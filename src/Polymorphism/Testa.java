package Polymorphism;

public class Testa {
public static void main(String[] args) {
	
  Shapea s = new Rectanglea(3,4);
  Shapea s1= new Circlea(2);
  Shapea s2= new Trianglea(5,6);
  
  System.out.println(s.area());
  System.out.println(s1.area());
  System.out.println(s2.area());
}	
}
