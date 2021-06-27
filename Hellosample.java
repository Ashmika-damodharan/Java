import java.util.Scanner;

public class Hellosample
    {
        public static void main(String ar[])
        {
            Scanner s=new Scanner(System.in);
            
            System.out.println("enter 2 number");
            
            int a=s.nextInt();
            int b=s.nextInt();
            int c=a+b;
            System.out.println(a+"    "+b);
            System.out.println("Result:"+c);
        }
    }
    

