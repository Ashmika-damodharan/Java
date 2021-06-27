public class Static3 
{
    int a;
    static int b;
    public static void main(String str[])
    {
        Static3 s=new Static3();
        Static3 s1=new Static3();

        s.a=20;
        s1.a=59;
        s.b=8;
        s1.b=0;//Here we have 2 objects s and s1. in each object we gives values for a and b. in case of b, since its static, it have a common memory space. so even though 2 objects are there, b will assign only the last value given in it,which is a replaced one to the allocated memory space.

        System.out.println("s.a"+s.a);
        System.out.println("s1.a"+s1.a);
        System.out.println("s.b"+s.b);
        System.out.println("s1.a"+s.b);

    }
    
}
