
//*NOTE*   : ENABLE ANY ONE CONSTRUCTOR AT A TIME.

public class ThisKeyword 
{
    int a=800,b=900;//The  variables a and b here are GLOBAL VARIABLES. These are variables which are declared outside the constructer or methods.
    ThisKeyword(int a,int b)//The variables a and b here are LOCAL VARIABLES. These are variables which are declared inside the constructer or methods.
    {
        System.out.println(a+"  "+b);

    }
    

//Now we have to keep the argument comming from the main class to globl variables a and b(bfore it was kept in local variables a and b).For that we use This keyword.
     ThisKeyword(int a,int b)
     {
         this.a=a;
         this.b=b;
         System.out.println(this.a+"  "+this.b);//now the values assigned in the main class 10&20 are kept in globl variables bcz of which when we print this.a and this.b 10 and 20 will be printed.
     }
     //We can also keep the value of global in local too...
     ThisKeyword(int a,int b)
     {
         a=this.a;
         b=this.b;

         System.out.println(a+"  "+b);
     }
}

