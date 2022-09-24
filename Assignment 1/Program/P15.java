// Que Write a java program to find LCM of two number

import java.util.Scanner;

class P15
{
	
	static int gcd(int a,int b)
	{
		int gcd=1;
		for(int i=2;i<=a&&i<=b;i++)
		{
			if(a%i==0&&b%i==0)	gcd=i;
		}
		return gcd;
	}
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a two number for finding lcm");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int lcm=a*b/gcd(a,b);
		System.out.println("LCM of two number is: "+lcm);
	}
}