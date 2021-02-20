import java.util.Scanner;
class Buzz
{
    public static void main(String args[])
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=obj.nextInt();
        int d=n%10;
        if (n%7==0 || d==7)
            System.out.println("Buzz Number");
        else
            System.out.println("Not A Buzz Number");
    }
}
