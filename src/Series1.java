import java.util.Scanner;
class Series1
{
    public static void main(String args[])
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the value of n:");
        int n=obj.nextInt();
        System.out.println("Enter 1 for sum, 2 for sum of square, 3 for sum of cube");
        double s=0;
        for (int i=1;i<=n;i++)
        {
            s=n*(n+1)/2;
        }
        System.out.println("Sum="+s);
    }
}
