//a function(method) with an argument in first method and return value in second method:
import java.util.Scanner;

public class SumObject 
{
    public static void main(String str[])
    {
    Scanner s=new Scanner(System.in);
    System.out.println("enter the values");
    int number1=s.nextInt();
    int number2=s.nextInt();

    Sum obj1=new Sum();

    obj1.CalculateSum(number1,number2);
    int Result=obj1.DisplaySum();
    System.out.println("the sum is" + Result);

    }  
}
