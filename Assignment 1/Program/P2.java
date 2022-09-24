// Write a java to find a factorial of given number

import java.util.Scanner;

class P2
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number to find a factorial");
		int n=sc.nextInt();
		long fact=1;
		for(int i=1;i<=n;i++)
		{
			fact*=i;
		}
		System.out.print("Factorial of given number is: "+fact);
	}
}