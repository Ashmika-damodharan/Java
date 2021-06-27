public class MethodOverloadingObject 
{
    public static void main(String[] args) {
        MethodOverLoading m=new MethodOverLoading();
        m.display();
        m.display(1);
        m.display(4,5);
        m.display(20.09F);//Here F is given after that decimal number is bcz, only in this case, overloading will be worked and display of float will be called. or else, that value will be stored in "double" by default.
    }
    
}
