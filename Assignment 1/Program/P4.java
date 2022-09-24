// Que Swap two number without using third variable 
import java.util.Scanner;

class P4
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a two number");
		int a=sc.nextInt();
		int b=sc.nextInt();
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("First number is: "+a);
		System.out.println("Secound number is: "+b);
		
	}
}