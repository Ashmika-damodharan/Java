import java.util.Scanner;

public class ArrayySample 
{
    public static void main(String sr[])
    {
        
        Scanner s=new Scanner(System.in);
        System.out.println("enter the limit");
        int limit=s.nextInt();

        int[] array=new int[limit];
        System.out.println("enter the values");
        for(int i=0;i<limit;i++)
        {
            array[i]=s.nextInt();
        }
        System.out.println("the entered array is: ");
        for(int i=0;i<limit;i++)
        {
            System.out.print(array[i]+"  ");
        }
    }
    
}
