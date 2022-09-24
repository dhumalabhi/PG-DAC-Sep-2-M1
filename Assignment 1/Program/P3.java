//Que Write a java to find a factorial of given number using recursion

import java.util.Scanner;

class P3
{
	static long fact(int n){
		if(n==1)	return 1;
		return	n*(fact(--n));
	}
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number to find factorial");
		int n=sc.nextInt();
		System.out.println("Factorial is: "+fact(n));
	}
}