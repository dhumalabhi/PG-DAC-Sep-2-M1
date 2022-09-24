// Que Reverse given number

import java.util.Scanner;

class P13
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int a=sc.nextInt();
		int temp=a;
		int reverse=0;
		while(temp>0)
		{
			
			reverse+=temp%10;
			temp/=10;
			if(temp>0)	reverse*=10;
		}
		System.out.println("Reverse number is: "+reverse);
	}
}