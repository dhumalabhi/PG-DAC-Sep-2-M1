//Que Check the given number is ODD or EVEN

import java.util.Scanner;

class P1
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number to check ODD or EVEN");
		int n=sc.nextInt();
		if((n&1)==0)	System.out.println(n+" is EVEN");
		else 		System.out.println(n+" is ODD");
		
	}
}
