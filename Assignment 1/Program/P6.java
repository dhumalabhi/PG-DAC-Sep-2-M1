// Que Write a java Program for given number is leap year or not

import java.util.Scanner;

class P6
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number to find positive or Negative");
		int n=sc.nextInt();
		if(n%100==0){
			if(n%400==0)	System.out.println("Year is Leap year");
			else	System.out.println("Year is not Leap year");
		}
		else if(n%4==0){
				System.out.println("Year is Leap year");
		}else	System.out.println("Year is not Leap year");
		
	}
}