import java.util.Scanner;

public class ibu 
{
    public static void main(String[] args) 
    {
        
        int flag=0;
        int sum=0;
        Scanner s= new Scanner(System.in);
        System.out.println("enter the no:of shoes");
        int limit=s.nextInt();
        
        int[] size=new int[limit];
        String[] temp=new String[limit];
        for(int i=0;i<limit;i++){
        System.out.println("enter the size of shoe"+ (i+1));
        size[i]=s.nextInt();
    }
    System.out.println("sizes are: ");
    for(int i=0;i<limit;i++){
        System.out.print(size[i]+"  ");}

   
    String[] side=new String[limit];
    for(int i=0;i<limit;i++){
        System.out.println("\nenter the side of shoe(right or left)"+ (i+1));
        side[i]=s.next();
    }
    System.out.println("sides are: ");
        for(int i=0;i<limit;i++){
            System.out.print(side[i]+"  ");
        }
        for(int i=0;i<limit;i++)
        {
            temp[i]=side[i]+size[i];
            
        }
        System.out.println("\nSo given list is");
        for(int i=0;i<limit;i++)
        {
            System.out.print(temp[i]+" ");
        }
        for(int i=0;i<limit;i++)
        {
            for(int j=i+1;j<limit;j++)
            {
                if(size[i]==size[j]&(!side[i]. equals(side[j])))
                {
                        
                        sum=sum+1;
                        flag=1;

                }
               
                
               
            }
               
        }
        System.out.println("\ntotal"+sum+"pairs");
        if (flag!=1)
        {
            System.out.println("\nno pairs");
        }
        
               
   }
}
