//Que Write a java to print 1 to 10 without using loop


class P7
{
	static void print(int n){
		if(n>0){
			print(n-1);
			System.out.println(n);
		}
		return;
	}
	public static void main(String []args)
	{
		print(10);
	}
}