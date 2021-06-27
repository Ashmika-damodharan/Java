import java.util.Scanner;

public class ForloopSample 
{
    public static void main(String sc[])
    {
        System.out.println("enter the limit");
        Scanner s=new Scanner(System.in);
        int number=s.nextInt();
        int sum=0;
        for(int i=0;i<=number;i++)
        {
            System.out.print("\t"+i);
            sum=sum+i;
        }
        System.out.println("\n");
        System.out.println("Sum of entered numbers are" +sum);

    }
    
}
