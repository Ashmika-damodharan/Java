public class SuperB extends SuperA
{
    int b;
    void display()
    {
        System.out.println("its B");
        super.display();
    }
    public static void main(String[] args) {
        SuperB b= new SuperB();
        b.display();
    }
    
}
