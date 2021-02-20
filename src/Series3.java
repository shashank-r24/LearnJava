import java.util.Scanner;
class Series3

{
    public static void main(String args[])
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the value of n:");
        int n=obj.nextInt();
        double s=0;
        for (int i=1;i<=n;i++)
        {
            s=Math.pow((n*(n+1)/2),2);
        }
        System.out.println("Sum="+s);
    }
}
