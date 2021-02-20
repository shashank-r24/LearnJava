import java.util.Scanner;
public class Logic
{
    public static void main(String args[])
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the value of N:");
        int N=obj.nextInt();
        int max=1,t=1,i=1,c=0;
        while(i<N)
        {
            if (N%i==0)
            {
                t=N;
                c=1;
                while (t%i==0)
                {
                    t=t/i;
                    c=c+1;
                }
            }
            if(c>=t)
            {
                max=i;
                t=c;
            }
            i=i+1;
        }
        System.out.println(max);
    }
}
