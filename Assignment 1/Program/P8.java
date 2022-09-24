// Que Write a java program to print digit of given number

import java.util.Scanner;

class P8
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number to print digit of given number");
		int n=sc.nextInt();
		while(n>0){
				System.out.println(n%10);
				n/=10;
		}
		
	}
}