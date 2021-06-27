//Method Overloading:It is a concept in POLYMORPHISM. In a class we can write many methods of same name eg:display() , but each one will be different in the no:of argument given in it or datatype given etc.

public class MethodOverLoading 
{
    void display()
    {
        System.out.println("hey");
    }
    void display(int a)
    {
        System.out.println(a);
    }
    void display(int a, int b)
    {
        System.out.println(a+" "+b);
    }
    void display(float a)
    {
        System.out.println(a);
    }
    
}
//A single method(function )is used for various functns.
