import java.util.Scanner;
class Reverse
{
    public static void main(String args[])
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=obj.nextInt();
        int d,r=0;
        for (int i=n;i>0;i=i/10)
        {
            d=i%10;
            r=r*10+d;
        }
        System.out.println("Reverse="+r);
    }
}
