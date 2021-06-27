import java.util.Scanner;

public class ArraySorting 
{
    public static void main(String sr[])
    {
        Scanner s=new Scanner(System.in);
        System.out.println("enter the limit of array");
        int limit=s.nextInt();
        int[] array=new int[limit];
        System.out.println("enter the values");
        for(int i=0;i<limit;i++)
        {
            array[i]=s.nextInt();
        }
        for(int i=0;i<limit-1;i++)
        {
            for(int j=i+1;j<limit;j++)
            {
                if(array[i]>array[j])
                {
                    int temp=array[i];
                    array[i]=array[j];
                    array[j]=temp;
                }
                 
            }
        }
        System.out.println("The sorted array is: ");
        for(int i=0;i<limit;i++)
        {
            System.out.print(array[i]+"  ");
        }

    }
    
}
