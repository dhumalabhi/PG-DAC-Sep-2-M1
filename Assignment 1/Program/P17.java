// Que Write a java program for check given number is palindrom or not

import java.util.Scanner;

class P17
{
	static int palindrom(int n)
	{
		int temp=0;
		while(n>0)
		{
			temp=temp+n%10;
			n/=10;
			if(n>0)	temp*=10;
		}
		return temp;
	}
	public static void main(String[] args)    
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number for check number is palindrom or not");
		int a=sc.nextInt();
		if(a==palindrom(a))
		{
			System.out.println(a+" is palindrom");
		}else{
			System.out.println(a+" is not palindrom");
		}
		
	}
}