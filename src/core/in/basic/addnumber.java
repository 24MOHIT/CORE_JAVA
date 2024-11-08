package core.in.basic;

import java.util.Scanner;

public class addnumber 
{
public static void main (String[] args)
{
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter your number a=");
    int a=sc.nextInt();
    
    System.out.println("Enter your number b=");
    int b=sc.nextInt();
    int c=a+b;
     
    System.out.println("add="+c);
}
}
