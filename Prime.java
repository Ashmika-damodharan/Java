import java.util.Scanner;

public class Prime 
{
    public static void main(String sc[])
    {
        int flag=0;

        Scanner s=new Scanner(System.in);
        System.out.println("enter the number: ");
        int number=s.nextInt();
        for(int i=2;i<number/2;i++)
        {
             if(number%i==0)
             {
                 flag=1;
             }
        }
        if(flag==1)
        {
            System.out.println(number+ "  is not prime");
        }
        else{
            System.out.println(number+ "  is prime");
        }
    }
}
