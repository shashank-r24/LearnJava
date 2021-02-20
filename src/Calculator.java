import java.util.Scanner;
class Calculator
{
    public static void main(String args[])
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter two numbers");
        double a=obj.nextDouble();
        double b=obj.nextDouble();
        System.out.println("Enter an operator:{+,-,*,/}");
        char oper=obj.next().charAt(0);
        double res;
        switch (oper)
        {
            case '+':
                res=a+b;
                System.out.println("Addition="+res);
                break;
            case '-':
                res=a-b;
                System.out.println("Subtraction"+res);
                break;
            case '*':
                res=a*b;
                System.out.println("Product="+res);
                break;
            case '/':
                res=a/b;
                System.out.println("Division="+res);
                break;
            default:System.out.println("Invalid Operator");
        }
    }
}
