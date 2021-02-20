import java.util.Scanner;
class Armstrong
{
	public static void main(String args[])
	{
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=obj.nextInt();
		int d,c,s=0;
		for (int i=n;i!=0;i=i/10)
		{
			d=i%10;
			c=d*d*d;
			s=s+c;
		}
		if (n==s)
			System.out.println("Armstrong Number");
		else
			System.out.println("Not An Armstrong Number");
	}
}
