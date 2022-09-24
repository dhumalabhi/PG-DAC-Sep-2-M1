// Que write a java program to print all prime factor of given number

import java.util.Scanner;

class P18
{
	/*
	static int primeNumber(int n)
	{
		for(int i=2;i<=Math.sqrt(n);i++)
		{
			if(n%i==0)	return -1;
		}
		return n;
	}
	*/
	
	static void primeFactor(int n)
	{
		while(n%2==0){
			System.out.print(2+" ");
			n/=2;
		}
		for(int i=3;i<=Math.sqrt(n);i+=2)
		{
			while(n%i==0){
				System.out.print(i+" ");
				n/=i;
			}
		}
		if(n>2) System.out.print(n);
		
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		primeFactor(n);
		
	}
}