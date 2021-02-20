import java.util.Scanner;
class Trigonometry
{
    public static void main(String args[])
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the Angle in Degrees:");
        double ang=obj.nextDouble();
        System.out.println("Enter Trigonometric Function-{sin/cos/tan}:");
        java.lang.String fun= obj.nextLine();
        ang=Math.toRadians(ang);
        double res;
        switch (fun)
        {
            case "sin":
                res=Math.sin(ang);
                System.out.println("Sin Value="+res);
                break;
            case "cos":
                res=Math.cos(ang);
                System.out.println("Cos Value="+res);
                break;
            case "tan":
                res=Math.tan(ang);
                System.out.println("Tan Value="+res);
                break;
        }
    }
}
