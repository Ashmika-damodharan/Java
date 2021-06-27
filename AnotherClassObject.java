//function with argument and without return value
import java.util.Scanner;

public class AnotherClassObject 
{
    public static void main(String str[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the numbers for addition");
        int num1=sc.nextInt();
        int num2=sc.nextInt();

        int num3=sc.nextInt();
        int num4=sc.nextInt();
        AnotherClass obj1=new AnotherClass();
        obj1.CalculateSum(num1,num2);
        obj1.DisplaySum();

        obj1.CalculateSum(num3,num4);
        obj1.DisplaySum();

        obj1.DisplaySum();//In this code, only one object is used. so sum of num1 and num2 & sum of num3 and num4 will be stored in same object by simply replacing.If we want to store a sum value in an object permenantly, then create a sepearte object for that.
        
        
    }
    
}
