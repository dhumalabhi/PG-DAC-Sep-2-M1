// Que Write a java program for find LCM of two number using prime fator method

import java.util.Scanner;
class P16
{
	static int lcm(int a, int b, int lcm)
	{
		if(a==1 && b==1)	return lcm;
		int ans=1;
		for(int i=2;i<=a || i<=b;i++)
		{
			if(a%i==0 || b%i==0)
			{
				if(a%i==0)	a=a/i;
				if(b%i==0)	b=b/i;
				ans=lcm(a,b,(lcm*i));
				break;
			}
		}
		return ans;
		
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a two number");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int lcm=lcm(a,b,1);
		System.out.print("LCM of given number is: "+lcm);
	}
}