import java.util.Scanner;
class PrimeFactors
{
    public static void main(String args[])
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter a number:");
        int n=obj.nextInt();
        for (int i=2;i<n;i++)
        {
            while (n%i==0)
            {
                System.out.println(i+" ");
                n=n/i;
            }
            if (n>=2)
                System.out.println(n);
        }
    }
}
