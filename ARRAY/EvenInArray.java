import java.util.Scanner;

public class EvenInArray 
{
    public static void main(String sr[])
    {
        int flag=0;
        Scanner s=new Scanner(System.in);
        System.out.println("enter the limit of the array");
        int limit=s.nextInt();
        int[] array=new int[limit];
        System.out.println("ENTER the values in array");
        for(int i=0;i<limit;i++)
        {
            array[i]=s.nextInt();
        }
        System.out.println("Even numbers in the given array are: ");
        
        for(int i=0;i<limit;i++)
        {
            if(array[i]%2==0)
            {
               System.out.print(array[i]+"  ");
            }
        }
       

    }
    
}
