class BME3
{
    public static void main(String args[])
    {
        double W=50*9.81;
        double a1=Math.toRadians(155);
        double a2=Math.toRadians(130);
        double a3=Math.toRadians(75);
        double Fpq=(W*Math.sin(a2))/Math.sin(a3);
        double Fpr=(W*Math.sin(a1))/Math.sin(a3);
        System.out.println("Force on PQ="+Fpq);
        System.out.println("Force on PR="+Fpr);
    }
}
