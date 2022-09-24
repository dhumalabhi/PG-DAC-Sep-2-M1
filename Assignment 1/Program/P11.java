//Que Find smallest of 3 number(a,b,c)

import java.util.Scanner;

class P11
{
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a three number");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		if(a<b&&a<c){
			System.out.print("Smallest number is: "+a);
		}else if(b<a&&b<c){
			System.out.println("Smallest number is: "+b);
		}else{
			System.out.println("Smallest number is: "+c);
		}
		
	}
}