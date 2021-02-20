import java.util.Scanner;
class Digit
{
    public static void main(String args[])
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=obj.nextInt();
        int d;
        for (int i=n;i!=0;i=i/10)
        {
            d=i%10;
            System.out.println(d);
        }
    }
}
