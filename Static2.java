public class Static2 
{
    public static void main(String str[])
    {
        Static2 s=new Static2();
        s.hello();//here we could call a non static method in a static class bcz we use object in the previous line.We created object for the class Static2 in the main class in a single file,different from done before with oops.
        hey();//we can directly access the method hey bcz its static.
        s.hey();//we can also access it by creating objects too, but the thing is that it will have only common memory space for all the no:of arrays created.
    }
    void hello()//a non static function.
    {

    }
    //creating another method which is static:
    static void hey()
    {

    }
    
    
    
}
