// Que Add two number without using arithmatic number

import java.util.Scanner;

class P12
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a two number");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int sum=b;
		for(int i=0;i<a;i++)
		{
			sum++;
		}
		System.out.println("Sum of given number is: "+sum);
	}
}