import java.util.Scanner;

public class StringArray 
{
    public static void main(String sr[])
    {
        Scanner s=new Scanner(System.in);
        System.out.println("enter the limit");
        int limit=s.nextInt();
        String[] array=new String[limit];
        for(int i=0;i<limit;i++)
        {
            System.out.println("enter the name" +(i+1));
            array[i]=s.next();
        }
        System.out.println("The entered names are: ");
        for(int i=0;i<limit;i++)
        {
            System.out.print(array[i]+" ");
        }
    }
    
}
