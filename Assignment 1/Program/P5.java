// Que How to check given number is positive or negative in java

import java.util.Scanner;

class P5
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number to find positive or Negative");
		int n=sc.nextInt();
		if(n>0)	System.out.print("Number is Positive");
		if(n<0)	System.out.print("Number is Negative");
		if(n==0)	System.out.print("Number is Nuetral");
		
	}
}