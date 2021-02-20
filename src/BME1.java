import java.util.Scanner;
class BME1
{
    public static void main(String args[])
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the value of Force 1 and 2");
        double F1=obj.nextInt();
        double F2=obj.nextInt();
        double Ay,Ax;
        double Cy=(F1*2.25+800*1.3)/3;
        Ay=F1-Cy;
        Ax=-F2;
        System.out.println("Ay="+Ay);
        System.out.println("Ax="+Ax);
        System.out.println("Cy="+Cy);
    }
}
