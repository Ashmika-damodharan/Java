import java.util.Scanner;

public class AssignmentObject 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        AssignmentVideo7 ao=new AssignmentVideo7();
        System.out.println("enter the numbers");
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("select a number:");
        System.out.println("1:Addition"+"\n"+"2:Substraction"+"\n"+"3:Multiplication"+"\n"+"4:Division");
        int c=sc.nextInt();

        if(c==1)
        {
            ao.Addition(a,b);
        }
        else if (c==2) 
        {
            ao.Substraction(a,b);
            
        } else if(c==3) 
        {
            ao.Multiplication(a,b);
            
        }
        else if(c==4)
        {
            ao.Division(a,b);
        }

        
    }

    
}
