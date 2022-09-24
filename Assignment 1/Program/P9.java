// Write a java Program to print all factors of given number

import java.util.Scanner;

class P9
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number which factor want to find");
		int n=sc.nextInt();
		System.out.println("Factors of given number is ");
		for(int i=1;i<=n;i++){
			if(n%i==0)
				System.out.print(i+" ");
		}
		
	}
}