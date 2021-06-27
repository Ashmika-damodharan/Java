public class Static1 
{
    int a=10;
    public static void main(String str[])//main function must always be static to run the class from command prompt.
    {
         System.out.println(a);//Here we cannot print a bcz, a static method can only directly acces another static variable or static method.
         Hello();//here we could access hello method bcz its static.
    }
    static void Hello()
    {
        System.out.println("hey");
    }
}

//FEATURES OF OBJECT AND STATIC:
//Both are complementary to each other.
//in object , we can create many no:of objects for a class and each of em will have an seperate memory space.
//but in case of static, a static in a class will have common memory space for all.
