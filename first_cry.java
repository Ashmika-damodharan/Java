import java.util.Scanner;

public class first_cry
{
    public static void main(String ar[])
    {
        System.out.println("enter 2 numbers");
        Scanner s=new Scanner(System.in);

        int a=s.nextInt();
        int b=s.nextInt();
        int c=a+b;
        System.out.println(a+"  "+b);
        System.out.println("The result is :"+c);

    }

}