import java.util.Scanner;
class Magic
{
    public static void main(String args[])
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=obj.nextInt();
        int sum,num=n;
        while(num>9)
        {
            sum=num;
            int s=0,d;
            while(sum!=0)
            {
                d=sum%10;
                s=s+d;
                sum=sum/10;
            }
            num=s;
        }
        if (num==1)
            System.out.println("Magic Number");
        else
            System.out.println("Not A Magic Number");
    }
}
