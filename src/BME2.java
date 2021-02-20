class BME2
{
    public static void main(String args[])
    {
        double Foa=173,Foc=281;
        double a1=61.67,a2=9.11;
        double A1=Math.toRadians(a1);
        double A2=Math.toRadians(a2);
        double Fob=(Foc-Foa*Math.cos(A1))/Math.cos(A2);
        double Fd=(Foa*Math.sin(A1))-(Fob*Math.sin(A2));
        System.out.println("Force on OB="+Fob);
        System.out.println("Force on OD="+Fd);
    }
}
