//OVERRIDING is also a concept in polymorphism. if we create 2 classes A and B(A is base class and B subclass), and writes same method(display()) and create object for B, and calls the method display(), the since both classes are having same methods, method in subclass only works. the one base class will be hidden.

public class OverRidingA 
{
    void display()
    {
        System.out.println("its A");
    }
    
}
