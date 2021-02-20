import java.util.Scanner;
class Prime
{
    public static void main(String args[])
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=obj.nextInt();
        int c=0;
        for(int i=1;i<=n;i++)
        {
            if (n%i==0)
                c++;
        }
        if (c==2)
            System.out.println("Prime Number");
        else if (c==1)
            System.out.println("Unique Number");
        else
            System.out.println("Not A Prime Number");
    }
}
