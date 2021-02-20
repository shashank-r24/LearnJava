import java.util.Scanner;
class Geometry3D
{
    public static void main(String args[])
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter 1 for Cuboid, 2 for Cube, 3 for Sphere, 4 for Hemisphere, " +
                "5 for Cone, 6 for Solid Cylinder, 7 for Hollow Cylinder, 8 for Frustum");
        int choice=obj.nextInt();
        switch (choice)
        {
            case 1:
                System.out.println("Enter length, breadth and height of the cuboid:");
                double l=obj.nextDouble();
                double b=obj.nextDouble();
                double h=obj.nextDouble();
                double Vc=l*b*h;
                double SAc=2*(l*b+b*h+h*l);
                double LSAc=2*h*(l+b);
                double Pc=4*(l+b+h);
                double Dc=Math.sqrt(l*l*+b*b+h*h);
                System.out.println("Volume:"+Vc);
                System.out.println("Surface Area:"+SAc);
                System.out.println("Lateral Surface Area:"+LSAc);
                System.out.println("Diagonal:"+Dc);
                break;
            case 2:
                System.out.println("Enter side of the cube");
                double a=obj.nextDouble();
                double V=a*a*a;
                double SA=6*a*a;
                double LSA=4*a*a;
                double D=Math.sqrt(3)*a;
                System.out.println("Volume:"+V);
                System.out.println("Surface Area:"+SA);
                System.out.println("Lateral Surface Area:"+LSA);
                System.out.println("Diagonal:"+D);
                break;
            case 3:
                System.out.println("Enter radius of the sphere:");
                double rs=obj.nextDouble();
                double Vs=(4*Math.PI*rs*rs*rs)/3;
                double SAs=4*Math.PI*rs*rs;
                double LSAs=4*Math.PI*rs*rs;
                System.out.println("Volume:"+Vs);
                System.out.println("Surface Area:"+SAs);
                System.out.println("Lateral Surface Area:"+LSAs);
                break;
            case 4:
                System.out.println("Enter radius of the hemisphere:");
                double rh=obj.nextDouble();
                double Vh=(2*Math.PI*rh*rh*rh)/3;
                double SAh=2*Math.PI*rh*rh;
                double LSAh=3*Math.PI*rh*rh;
                System.out.println("Volume:"+Vh);
                System.out.println("Surface Area:"+SAh);
                System.out.println("Lateral Surface Area:"+LSAh);
                break;
            case 5:
                System.out.println("Enter length, height and radius of the cone:");
                double lc=obj.nextDouble();
                double hc=obj.nextDouble();
                double rc=obj.nextDouble();
                double Vco=(Math.PI*rc*rc)/3;
                double SAco=Math.PI*rc*(rc+lc);
                double LSAco=Math.PI*rc*lc;
                System.out.println("Volume:"+Vco);
                System.out.println("Surface Area:"+SAco);
                System.out.println("Lateral Surface Area:"+LSAco);
                break;
            case 6:
                System.out.println("Enter height and radius of the solid cylinder:");
                double hsc=obj.nextDouble();
                double rsc=obj.nextDouble();
                double Vsc=Math.PI*rsc*rsc*hsc;
                double SAsc=2*Math.PI*rsc*(rsc+hsc);
                double LSAsc=2*Math.PI*rsc*hsc;
                System.out.println("Volume:"+Vsc);
                System.out.println("Surface Area:"+SAsc);
                System.out.println("Lateral Surface Area:"+LSAsc);break;
            case 7:
                System.out.println("Enter height, outer radius, inner radius of the hollow cylinder:");
                double hcy=obj.nextDouble();
                double or=obj.nextDouble();
                double ir=obj.nextDouble();
                double Vcy= Math.PI*(or*or-ir*ir)*hcy;
                double SAcy=2*Math.PI*hcy*(or+ir)*(or-ir+hcy);
                double LSAcy=2*Math.PI*hcy*(or+ir);
                System.out.println("Volume:"+Vcy);
                System.out.println("Surface Area:"+SAcy);
                System.out.println("Lateral Surface Area:"+LSAcy);
                break;
            default:
                System.out.println("Invalid Choice");
        }
    }
}
