import java.util.Scanner;

public class FunctionSample 
{
    public static void main(String sr[])
    {
        System.out.println("enter 2 numbers");
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int b=s.nextInt();

        int result=sum(a,b);

        System.out.println("result is : "+result);
    }

    static int sum(int num1,int num2)
    {
        int s=num1+num2;
        return s;
    }

    
}
