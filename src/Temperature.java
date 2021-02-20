import java.util.Scanner;
class Temperature
{
    public static void main(String[] args)
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter 1 for Fahrenheit and 2 for Celsius:");
        int choice= obj.nextInt();
        switch (choice)
        {
            case 1:
                System.out.println("Enter the temperature in Fahrenheit:");
                double tf1= obj.nextDouble();
                double tc1=(5/9.0)*(tf1-32);
                System.out.println("Temperature in Celsius:"+tc1);
                break;
            case 2:
                System.out.println("Enter the temperature in Celsius:");
                double tc2=obj.nextDouble();
                double tf2=(1.8*tc2)+32;
                System.out.println("Temperature in Fahrenheit:"+tf2);
                break;
            default:
                System.out.println("Invalid Choice");
        }
    }
}
