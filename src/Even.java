import java.util.Scanner;
class Even
{
    public static void main(String args[])
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=obj.nextInt();
        if (n%2==0)
            System.out.println("Even Number");
        else
            System.out.println("Odd Number");
    }
}
