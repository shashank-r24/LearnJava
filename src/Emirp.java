import java.util.Scanner;
class Emirp
{
    public static void main(String args[])
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=obj.nextInt();
        int c=0;int r=0;
        for (int i=1;i<=n;i++)
        {
            if (n%i==0)
                c++;
            {
                if (c==2)
                {
                    int d;
                    for (int j=n;j!=0;j=j/10)
                    {
                        d=j%10;
                        r=r*10+d;
                    }
                }
            }
        }
        if (r==n)
            System.out.println("Emirp Number");
        else
            System.out.println("Not An Emirp Number");
    }
}
