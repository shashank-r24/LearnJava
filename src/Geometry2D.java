import java.util.Scanner;
class Geometry2D
{
    public static void main(String[] args)
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter 1 for Square, 2 for Rectangle, 3 for Circle:");
        int choice=obj.nextInt();
        switch (choice)
        {
            case 1:
                System.out.println("Enter side of the square:");
                double s=obj.nextInt();
                double ps=4*s;
                double as=s*s;
                double ds=Math.sqrt(2)*s;
                System.out.println("Perimeter:"+ps);
                System.out.println("Area:"+as);
                System.out.println("Diagonal:"+ds);
                break;
            case 2:
                System.out.println("Enter length and breadth of the rectangle:");
                double l=obj.nextDouble();
                double b=obj.nextDouble();
                double pr=2*(l+b);
                double ar=l*b;
                double dr=Math.sqrt(l*l+b*b);
                System.out.println("Perimeter:"+pr);
                System.out.println("Area:"+ar);
                System.out.println("Diagonal:"+dr);
            case 3:
                System.out.println("Enter radius of the circle:");
                double r=obj.nextDouble();
                double d=r*2;
                double cc=2*Math.PI*r;
                double ac=Math.PI*r*r;
                System.out.println("Diameter:"+d);
                System.out.println("Circumference:"+cc);
                System.out.println("Area:"+ac);
            default:
                System.out.println("Invalid Choice");
        }
    }
}
