import java.util.Scanner;
class Neon
{
    public static void main(String args[])
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=obj.nextInt();
        int sq=n*n;
        int sum=0;
        for(int i=sq;i!=0;i=i/10)
        {
            int d=i%10;
            sum=sum+d;
        }
        if (n==sum)
            System.out.println("Neon Number");
        else
            System.out.println("Not A Neon Number");
    }
}
