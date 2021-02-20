import java.util.Scanner;
class Special
{
	public static void main(String args[])
	{
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=obj.nextInt();
		int d,s=0;
		for (int i=n;i!=0;i=i/10)
		{
			d=i%10;
			int f=1;
			for (int j=1;j<=d;j++)
			{
				f=f*j;
			}
			s=s+f;
		}
		if (s==n)
			System.out.println("Special Number");
		else
			System.out.println("Not A Special Number");
	}
}
