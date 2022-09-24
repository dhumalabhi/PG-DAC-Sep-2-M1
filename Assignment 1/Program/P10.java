// Que Write a java Program to find sum of digit of given number

import java.util.Scanner;

class P10
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number to find sum of it's digit");
		int n=sc.nextInt();
		int temp=n;
		long sum=0;
		while(temp>0){
			sum+=temp%10;
			temp/=10;
		}
		System.out.println("Sum of given number's digit is: "+sum);
		
	}
}
