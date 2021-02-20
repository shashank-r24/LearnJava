import java.util.Scanner;
class Month
{
    public static void main(String args[])
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter 1 for January, 2 for February, 3 for March, 4 for April, 5 for May, 6 for June, 7 for July, " +
                "8 for August, 9 for September, 10 for October, 11 for November, 12 for December:");
        int m=obj.nextInt();
        switch (m)
        {
            case 1:
                System.out.println("Month Is January");
                break;
            case 2:
                System.out.println("Month Is February");
                break;
            case 3:
                System.out.println("Month Is March");
                break;
            case 4:
                System.out.println("Month Is April");
                break;
            case 5:
                System.out.println("Month Is May");
                break;
            case 6:
                System.out.println("Month Is June");
                break;
            case 7:
                System.out.println("Month Is July");
                break;
            case 8:
                System.out.println("Month Is August");
                break;
            case 9:
                System.out.println("Month Is September");
                break;
            case 10:
                System.out.println("Month Is October");
                break;
            case 11:
                System.out.println("Month Is November");
                break;
            case 12:
                System.out.println("Month Is December");
                break;
            default:System.out.println("Invalid Entry");
        }
    }
}
