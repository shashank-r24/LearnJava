import java.util.Scanner;
class Niven
{
	public static void main(String args[])
	{
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=obj.nextInt();
		int s=0;
		for (int i=n;i!=0;i=i/10)
		{
			s=s+(i%10);
		}
		if (n%s==0)
			System.out.println("Niven Number");
		else
			System.out.println("Not A Niven Number");
	}
}
