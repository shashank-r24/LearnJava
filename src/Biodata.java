import java.util.Scanner;
class Biodata
{
    public static void main(String args[])
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter your name, age, class and section:");
        String n=obj.nextLine();
        byte age=obj.nextByte();
        byte cl=obj.nextByte();
        char sec=obj.next().charAt(0);
        System.out.println("Enter your gender[Male/Female/Others]:");
        String g=obj.nextLine();
        System.out.println("Enter your mobile number:");
        long mob=obj.nextLong();
        System.out.print("Name:"+n);
        System.out.println("Age="+age);
        System.out.println("Class:"+cl);
        System.out.println("Section:"+sec);
        System.out.println("Gender:"+g);
        System.out.println("Mobile No:"+mob);
    }
}
