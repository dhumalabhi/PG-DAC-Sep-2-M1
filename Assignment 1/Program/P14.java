// Que Write a java program to find GCD of given number

import java.util.Scanner;

class P14
{
	static int gcd(int a, int b)
	{
		int gcd=1;
		for(int i=2;i<=a&& i<=b;i++)
		{
			if(a%i==0&& b%i==0)	gcd=i;
		}
		return gcd;
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a two number for finding GCD");
		int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.println("GCD of two number is: "+gcd(a,b));
	}
}