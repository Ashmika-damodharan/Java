//this is the case of applying inheritance on constructer.If we do that without a super, then argumented constructer of A will not be printed, The other default constructer of A will be printed first and then argumented constructr of B. In case if we want to print argumented constructers of both A and B, super is used.
public class SuperConstructerB extends SuperConstructerA
{
    SuperConstructerB()
    {
        System.out.println("its B consructer");
    }
    SuperConstructerB(int a)
    {
        
        super(10);
        System.out.println("its argument B constructer");
    }
    public static void main(String[] args) {
        
    
        SuperConstructerB sb=new SuperConstructerB(10);
    }
    
    
}
