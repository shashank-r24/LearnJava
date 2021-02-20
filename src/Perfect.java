import java.util.Scanner;
class Perfect
{
    public static void main(String args[])
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=obj.nextInt();
        int s=0;
        for (int i=1;i<n;i++)
        {
            if (n%i==0)
                s=s+i;
        }
        if (s==n)
            System.out.println("Perfect Number");
        else
            System.out.println("Not A Perfect Number");
    }
}
